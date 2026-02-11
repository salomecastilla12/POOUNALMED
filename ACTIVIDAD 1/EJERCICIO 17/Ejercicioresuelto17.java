/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioresuelto17;
import java.util.Scanner;
/**
 *
 * @author Salome Castilla
 */
public class Ejercicioresuelto17 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
       double area_circulo,longitud_circulo,radio;
       System.out.println("Ingrese un numero para el radio de la circunferencia: ");
       radio=scanner.nextDouble();
       
       longitud_circulo=calculos17.calculo_longitud_circulo(radio);
       area_circulo=calculos17.calculo_area_circulo(radio);
       
       System.out.println("La longitud de la circunferencia es:" + longitud_circulo);
       System.out.println("El area del circulo es: " + area_circulo); 
    }
}
