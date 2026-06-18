/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad4;

/**
 *
 * @author Salome Castilla
 */
public class vendedor {
    //Atributos
    
    private String nombre;
    private String apellidos;
    private int edad;
    //Constructor
    public vendedor(String nombre, String apellidos) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = 0; 
    }
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public int getEdad() { return edad; }
    // Metodos
    public void verificarEdad(int edad) throws IllegalArgumentException {
            if (edad < 0 || edad > 120) { 
                throw new IllegalArgumentException("La edad no puede ser negativa ni mayor a 120.");
            }
            if (edad < 18) { 
                throw new IllegalArgumentException("El vendedor debe ser mayor de 18 años.");
            }
            this.edad = edad; 
    }
    public String toString() {
        return "<html>**Datos Correctos**<br/>Nombre: " + nombre + "<br/>Apellidos: " + apellidos + "<br/>Edad: " + edad + "</html>";
    }

}
