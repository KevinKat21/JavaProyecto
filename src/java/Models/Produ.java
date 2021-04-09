
package Models;

import javax.ejb.Stateless;

/**
 *
 * @author KEVIN
 */
@Stateless
public class Produ {

    private int Id;
    private String Marca;
    private String Modelo;
    private int Cilindraje;
    private int Precio;

    /**
     *
     */
    public Produ() {
    }

    /**
     *
     * @param Id
     * @param Marca
     * @param Modelo
     * @param Cilindraje
     * @param Precio
     */
    public Produ(int Id, String Marca, String Modelo, int Cilindraje, int Precio) {
        this.Id = Id;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Cilindraje = Cilindraje;
        this.Precio = Precio;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return Id;
    }

    /**
     *
     * @param Id
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     *
     * @return
     */
    public String getMarca() {
        return Marca;
    }

    /**
     *
     * @param Marca
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     *
     * @return
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     *
     * @param Modelo
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     *
     * @return
     */
    public int getCilindraje() {
        return Cilindraje;
    }

    /**
     *
     * @param Cilindraje
     */
    public void setCilindraje(int Cilindraje) {
        this.Cilindraje = Cilindraje;
    }

    /**
     *
     * @return
     */
    public int getPrecio() {
        return Precio;
    }

    /**
     *
     * @param Precio
     */
    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
    
    
}
