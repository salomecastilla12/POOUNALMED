/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4_7;

/**
 *
 * @author Salome Castilla
 */
public class Prueba {
    public static void main(String[] args) {
        // Define un array de cuatro elementos de tipo Animal
        Animal[] animales = new Animal[4]; 
        
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new León();
        
        // Recorre el array de animales
        for (int i = 0; i < animales.length; i++) { 
            System.out.println(animales[i].getNombreCientífico());
            System.out.println("Sonido: " + animales[i].getSonido());
            System.out.println("Alimentos: " + animales[i].getAlimentos());
            System.out.println("Hábitat: " + animales[i].getHábitat());
            System.out.println(); // Salto de línea para separar cada animal
        }
    }
}
