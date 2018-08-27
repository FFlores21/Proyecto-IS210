/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teresa
 */
public class Cliente {
    
    private String Nombre;
    private String NumeroDeIdentidad;
    private String RTN;
    private boolean TerceraEdad;
    
    public Cliente(String Nombre, String NumeroDeIdentidad, String RTN){
    
        this.Nombre=Nombre;
        this.NumeroDeIdentidad=NumeroDeIdentidad;
        this.RTN=RTN;
        
    
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the NumeroDeIdentidad
     */
    public String getNumeroDeIdentidad() {
        return NumeroDeIdentidad;
    }

    /**
     * @param NumeroDeIdentidad the NumeroDeIdentidad to set
     */
    public void setNumeroDeIdentidad(String NumeroDeIdentidad) {
        this.NumeroDeIdentidad = NumeroDeIdentidad;
    }

    /**
     * @return the RTN
     */
    public String getRTN() {
        return RTN;
    }

    /**
     * @param RTN the RTN to set
     */
    public void setRTN(String RTN) {
        this.RTN = RTN;
    }

    /**
     * @return the TerceraEdad
     */
    public boolean isTerceraEdad() {
        return TerceraEdad;
    }

    /**
     * @param TerceraEdad the TerceraEdad to set
     */
    public void setTerceraEdad(boolean TerceraEdad) {
        this.TerceraEdad = TerceraEdad;
    }
    
    
    
    
    
}
