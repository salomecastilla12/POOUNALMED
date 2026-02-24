/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio23;

/**
 *
 * @author Salome Castilla
 */
public class EJERCICIO23 {

   public static void main(String args[]) {
    Automovil auto1 = new
    Automovil("Ford",2018,3,tipoCombus.DIESEL,tipoA.EJECUTIVO,5,6,250,

    tipoColor.NEGRO);
    auto1.imprimir();
    auto1.setVelocidadActual(100);
    System.out.println("Velocidad actual ="  + auto1.
    velocidadActual);
    auto1.acelerar(20);
    System.out.println("Velocidad actual = " + auto1.
    velocidadActual);
    auto1.desacelerar(50);
    System.out.println("Velocidad actual = " + auto1.
    velocidadActual);
    auto1.frenar();
    System.out.println("Velocidad actual = " + auto1.
    velocidadActual);
    auto1.desacelerar(20);
    }
    }