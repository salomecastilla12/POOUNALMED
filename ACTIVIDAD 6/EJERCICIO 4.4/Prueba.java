/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.profesores;

/**
 *
 * @author Salome Castilla
 */
public class Prueba {
    public static void main(String[] args) {
        
        // Polimorfismo: La variable es de tipo Profesor, 
        // pero el objeto real creado en memoria es ProfesorTitular
        Profesores profesor1 = new ProfesorTitular();
        
        profesor1.imprimir();
    }
}
