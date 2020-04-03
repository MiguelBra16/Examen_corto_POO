/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veterinaria;

/**
 *
 * @author bragh
 */
public abstract class Mascota {
    private String tipoMasco;
    
    
    public Mascota(String tipoMasco){
        this.tipoMasco = tipoMasco;
    }
    
    public String veterinaria(){
        return "Entrando al sistema de la veterinaria";
    }
    public String getTipoMasco(){
        return tipoMasco;
    }
    public void setTipoMasco(String tipoMasco){
        this.tipoMasco = tipoMasco;
    }
}
