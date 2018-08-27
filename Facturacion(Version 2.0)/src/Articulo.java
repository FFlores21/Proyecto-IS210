/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teresa
 */
public class Articulo {
    
    private int Cantidad;
    private String Articulo;
    private Double Precio;
    
    public Articulo(){}
    
    

    /**
     * @return the Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    /**
     * @return the Articulo
     */
    public String getArticulo() {
        return Articulo;
    }

    /**
     * @param Articulo the Articulo to set
     */
    public void setArticulo(String Articulo) {
        this.Articulo = Articulo;
    }

    /**
     * @return the Precio
     */
    public Double getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }
    
    
    
}
