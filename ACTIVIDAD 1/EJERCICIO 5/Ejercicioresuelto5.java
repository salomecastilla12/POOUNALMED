/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioresuelto5;

/**
 *
 * @author Salome Castilla
 */
public class Ejercicioresuelto5 {
    
     public static void main(String[] args){
        double suma, x, y ;
            suma = 0;
            y = 40; 
            x = 20;
            suma = suma + x ;
            x = x + Math.pow(y,2) ;
            suma = suma + x/y ;
            System.out.println("El valor de x es: " + x) ;
            System.out.println("El valor de y es: " + y);
            System.out.println("El valor de la suma es: " + suma);
    }    
}
