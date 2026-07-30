/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4_7;

/**
 *
 * @author Salome Castilla
 */
public abstract class Animal {
    protected String sonido; 
    protected String alimentos; 
    protected String hábitat; 
    protected String nombreCientífico; 

    // Métodos abstractos que deberán implementar las subclases
    public abstract String getNombreCientífico();
    public abstract String getSonido();
    public abstract String getAlimentos();
    public abstract String getHábitat();

}
