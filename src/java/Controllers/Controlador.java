
package Controllers;

import DAO.ConectarDB;
import DAO.VitrinaDao;
import Models.Produ;
import Models.produValidation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author KEVIN
 */
@Controller
public class Controlador {
    private JdbcTemplate jdbcTemplate;
    produValidation produValidar;

    /**
     *
     */
    public Controlador() {
        this.produValidar = new produValidation();
        ConectarDB con = new ConectarDB();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }
    
    /**
     *
     * @return Retorna una vista para enviarla al formulario
     */
    @RequestMapping(value="vitrina.htm", method=RequestMethod.GET)
        public ModelAndView home(){
            ModelAndView mav = new ModelAndView();
            Produ produ = new Produ();       
            mav.addObject("produ",produ);
            mav.setViewName("Views/vitrina");
            return mav;
    }
    
    /**
     *
     * @return Retorna una vista para enviarla al formulario
     */
    @RequestMapping(value="vitrina.htm", method=RequestMethod.POST)
        public ModelAndView mostrarProd(){
            ModelAndView mav = new ModelAndView();
            String sql = "select * from vitrina";
            List datos = this.jdbcTemplate.queryForList(sql);
            mav.addObject("produ",datos);
            mav.setViewName("Views/mostrarVitrina");
            return mav;
    }
    
//------------------ Metodo Agregar Producto ------------------    

    /**
     *
     * @return Retorna una vista para enviarla al formulario
     */
    @RequestMapping(value="agregarAvit.htm", method=RequestMethod.GET)
        public ModelAndView cargarProd(){
            ModelAndView mav = new ModelAndView();
            mav.addObject("produ", new Produ());
            mav.setViewName("Views/agregarAvit");
            return mav;
    }

    /**
     *
     * @param prod Datos del Producto
     * @param result Resultado
     * @param status Estado de la sesion
     * @return Retorna una vista para enviarla al formulario
     */
    @RequestMapping(value="agregarAvit.htm", method=RequestMethod.POST)
        public ModelAndView agregarProd(
            @ModelAttribute ("produ") Produ prod,
            BindingResult result,
            SessionStatus status
            )
        {
        this.produValidar.validate(prod,result);
        if(result.hasErrors()){
                ModelAndView mov = new ModelAndView();
                mov.addObject("produ", new Produ());
                mov.setViewName("Views/agregarAvit");
                return mov;
            }
            else{
                ModelAndView mav = new ModelAndView();
                String sql = "insert into vitrina (Marca, Modelo, Cilindraje, Precio) values (?,?,?,?)";
                this.jdbcTemplate.update(sql,prod.getMarca(), prod.getModelo(), prod.getCilindraje(), prod.getPrecio());
                mav.setViewName("redirect:/vitrina.htm");
                return mav;
            }
    }   
 //------------------- Metodo Actualizar Producto --------------

    /**
     *
     * @param request Dato requerido de la DB
     * @return Retorna una vista para enviarla al formulario
     */
    @RequestMapping(value="actualizarVit.htm", method=RequestMethod.GET)
        public ModelAndView actProd(HttpServletRequest request){
            ModelAndView mav = new ModelAndView();
            int Id = Integer.parseInt(request.getParameter("Id"));
            Produ prod = this.cargarProductobyId(Id);
            mav.addObject("produ", new Produ (Id, prod.getMarca(), prod.getModelo(), prod.getCilindraje(), prod.getPrecio()));
            mav.setViewName("Views/actualizarVit");
            return mav;
    }

    /**
     *
     * @param prod Datos del Producto
     * @param result Resultado
     * @param status Estado de la sesion
     * @return Retorna una vista para enviarla al formulario
     */
    @RequestMapping(value="actualizarVit.htm", method=RequestMethod.POST)
        public ModelAndView actProd(
                @ModelAttribute ("produ") Produ prod,
                BindingResult result,
                SessionStatus status
        ){
            this.produValidar.validate(prod,result);
            if(result.hasErrors()){
                ModelAndView mov = new ModelAndView();
                mov.addObject("produ", new Produ());
                mov.setViewName("Views/actualizarVit");
                return mov;
            }
            else{
                ModelAndView mav = new ModelAndView();
                VitrinaDao vidrao = new VitrinaDao();
                String Marca = prod.getMarca();
                String Modelo = prod.getModelo();
                int Cilindraje = prod.getCilindraje();
                int Precio = prod.getPrecio();
                int Id = prod.getId();
                vidrao.update(Marca, Modelo, Cilindraje, Precio, Id);
                mav.setViewName("redirect:/vitrina.htm");
                return mav;
            }
    }
//------------ Metodo Eliminar Producto ---------------------

    /**
     *
     * @param request Dato requerido de la DB
     * @return Retorna una vista para enviarla al formulario
     */
    @RequestMapping("borrarProdu.htm")
        public ModelAndView borrarProd(HttpServletRequest request ){
            ModelAndView mav = new ModelAndView();
            int Id = Integer.parseInt(request.getParameter("Id"));
            String sql = "delete from vitrina where Id = ? ";
            this.jdbcTemplate.update(sql,Id);
            mav.setViewName("redirect:/vitrina.htm");
            return mav;
    }
//------------ Metodo Consultar Datos y Cargarlos ----------

    /**
     *
     * @param Id Dato tomado de la DB
     * @return Retorna una vista para enviarla al formulario
     */
        public Produ cargarProductobyId(int Id){
        final Produ prod = new Produ();
        String sql = "select * from vitrina where Id = " + Id;
        return (Produ) jdbcTemplate.query(sql, new ResultSetExtractor<Produ>() {
            public Produ extractData(ResultSet rs) throws SQLException, DataAccessException {
                if(rs.next()){
                    prod.setId(rs.getInt("Id"));
                    prod.setMarca(rs.getString("Marca"));
                    prod.setModelo(rs.getString("Modelo"));
                    prod.setCilindraje(rs.getInt("Cilindraje"));
                    prod.setPrecio(rs.getInt("Precio"));
                }
                return prod;
            }
        });                
    }
//------------------------------------------------------------------------------

    /**
     *
     * @return Retorna una vista para enviarla al formulario
     */
    @RequestMapping(value = "ConsultarxMarca.htm", method = RequestMethod.GET)
        public ModelAndView listarProdByMarca(){
            ModelAndView mav = new ModelAndView();
            Produ produ = new Produ();
            mav.addObject("produ", produ);
            mav.setViewName("Views/ConsultarxMarca");
            return mav;
    }

    /**
     *
     * @param prod Datos del Producto
     * @param result Resultado
     * @param status Estado de la sesion
     * @return Retorna una vista para enviarla al formulario
     */
    @RequestMapping(value = "ConsultarxMarca.htm", method = RequestMethod.POST)
        public ModelAndView listarProdByMarca(
            @ModelAttribute ("produ") Produ prod,
            BindingResult result,
            SessionStatus status){
            ModelAndView mav = new ModelAndView();
            VitrinaDao VitriDao = new VitrinaDao();
            String Mar = prod.getMarca();
            mav.addObject("produ", VitriDao.consultarProdByMarca(Mar));
            mav.setViewName("Views/ListarProductoMarca");
            return mav;
    }
}
