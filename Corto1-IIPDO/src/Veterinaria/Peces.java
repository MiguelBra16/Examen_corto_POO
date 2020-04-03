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
public class Peces extends Mascota{
    private String nombre;
    private String tipoPez;
    private String colorPez;
    private String edad;
    
    public Peces(String nombre, String tipoPez, String colorPez, String edad, String tipoMasco){
        super(tipoMasco);
        this.nombre = nombre;
        this.tipoPez = tipoPez;
        this.colorPez = colorPez;
        this.edad = edad;
    }
    @Override
    public String veterinaria(){
        return "Su mascota es un pez y se llama: " + this.getNombre() + "\nEl tipo de pez es: " + this.getTipoPez();
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getTipoPez(){
        return tipoPez;
    }
    public void setTipoPez(String tipoPez){
        this.tipoPez = tipoPez;
    }
    public String getColorPez(){
        return colorPez;
    }
    public void setColorPez(String colorPez){
        this.colorPez = colorPez;
    }
    public String getEdad(){
        return edad;
    }
    public void setEdad(String edad){
        this.edad = edad;
    }
}
