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
public class Perro extends Mascota{
    private String nombre;
    private String raza;
    private String pelo;
    private String colorPelo;
    private String edad;
    
    public Perro(String nombre, String raza, String pelo, String colorPelo, String edad, String tipoMasco){
    super(tipoMasco);
    this.nombre = nombre;
    this.raza = raza;
    this.pelo = pelo;
    this.colorPelo = colorPelo;
    this.edad = edad;
    }   
    @Override
    public String veterinaria(){
        return "Su mascota es un perro y se llama: " + this.getNombre() + "\nLa raza de su perro es: " + this.getRaza();
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    public String getPelo(){
        return pelo;
    }
    public void setPelo(String pelo){
        this.pelo = pelo;
    }
    public String getColorPelo(){
        return colorPelo;
    }
    public void setColorPelo(String colorPelo){
        this.colorPelo = colorPelo;
    }
    public String getEdad(){
        return edad;
    }
    public void setEdad(String edad){
        this.edad = edad;
    }
}
