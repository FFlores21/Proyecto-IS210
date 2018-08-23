/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teresa
 */
public class Factura {
    
    private float ISV;    
    private float Total;
    private float TotalAPagar;
    
    private Cliente Persona;
    private Articulo []ListaArticulos;
    
    public Factura(){
    
        ListaArticulos=new Articulo[50];
        
    }

    /**
     * @return the ISV
     */
    public float getISV() {
        return ISV;
    }

    /**
     * @param ISV the ISV to set
     */
    public void setISV(float ISV) {
        this.ISV = ISV;
    }

    /**
     * @return the Total
     */
    public float getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(float Total) {
        this.Total = Total;
    }

    /**
     * @return the TotalAPagar
     */
    public float getTotalAPagar() {
        return TotalAPagar;
    }

    /**
     * @param TotalAPagar the TotalAPagar to set
     */
    public void setTotalAPagar(float TotalAPagar) {
        this.TotalAPagar = TotalAPagar;
    }
    
            
            
}
