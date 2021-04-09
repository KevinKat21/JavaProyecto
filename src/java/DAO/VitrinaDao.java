/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author KEVIN
 */
public class VitrinaDao {
    JdbcTemplate jdbcTemplate;
    ConectarDB con = new ConectarDB();
    
    /**
     *
     * @param Id Dato tomado de la DB
     * @return Retorna una vista para enviarla al formulario
     */
    public List consultarProdById (int Id){
        List prod = new ArrayList();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        String sql = "select * from vitrina where Id = ?";
        prod = this.jdbcTemplate.queryForList(sql, Id);
        return prod;
    }

    /**
     *
     * @param Marca Dato tomado de la DB
     * @return Retorna una vista para enviarla al formulario
     */
    public List consultarProdByMarca (String Marca){
        List prod = new ArrayList();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        String sql = "select * from vitrina where Marca like '%" + Marca + "%' ";
        prod = this.jdbcTemplate.queryForList(sql);
        return prod;
    }
    
    /**
     *
     * @param Marca
     * @param Modelo
     * @param Cilindraje
     * @param Precio
     * @param Id
     */
    public void update(String Marca, String Modelo, int Cilindraje, int Precio, int Id) {
    this.jdbcTemplate = new JdbcTemplate(con.conectar());
    String sql = "update vitrina set Marca = '"+Marca+"', Modelo = '"+Modelo+"' , Cilindraje = '"+Cilindraje+"', Precio = '"+Precio+"' where Id = '"+Id+"' ";
    this.jdbcTemplate.update(sql);
    }
}
