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
public class Aves extends Mascota{
    private String nombre;
    private String tipoAve;
    private String colorPluma;
    private String edad;
    
    public Aves(String nombre, String tipoAve, String colorPluma, String edad, String tipoMasco){
        super(tipoMasco);
        this.nombre = nombre;
        this.tipoAve = tipoAve;
        this.colorPluma = colorPluma;
        this.edad = edad;
    }
    @Override
    public String veterinaria(){
        return "Su mascota es un ave y se llama: " + this.getNombre() + "\nEl tipo de ave es: " + this.getTipoAve();
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getTipoAve(){
        return tipoAve;
    }
    public void setTipoAve(String tipoAve){
        this.tipoAve = tipoAve;
    }
    public String getColorPluma(){
        return colorPluma;
    }
    public void setColorPluma(String colorPluma){
        this.colorPluma = colorPluma;
    }
    public String getEdad(){
        return edad;
    }
    public void setEdad(String edad){
        this.edad = edad;
    }
}
