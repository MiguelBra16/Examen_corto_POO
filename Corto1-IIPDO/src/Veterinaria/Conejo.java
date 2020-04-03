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
public class Conejo extends Mascota{
    private String nombre;
    private String tipoConejo;
    private String colorConejo;
    private String edad;
    
    public Conejo(String nombre, String tipoConejo, String colorConejo, String edad, String tipoMasco){
        super(tipoMasco);
        this.nombre = nombre;
        this.tipoConejo = tipoConejo;
        this.colorConejo = colorConejo;
        this.edad = edad;
    }
    @Override
    public String veterinaria(){
        return "Su mascota es un conejo y se llama: " + this.getNombre() + "\nEl tipo de conejo es: " + this.getTipoConejo();
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getTipoConejo(){
        return tipoConejo;
    }
    public void setTipoConejo(String tipoConejo){
        this.tipoConejo = tipoConejo;
    }
    public String getColorConejo(){
        return colorConejo;
    }
    public void setColorConejo(String colorConejo){
        this.colorConejo = colorConejo;
    }
    public String getEdad(){
        return edad;
    }
    public void setEdad(String edad){
        this.edad = edad;
    }
}
