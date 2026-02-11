/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosresuelto14;
import java.util.Scanner;
/**
 *
 * @author Salome Castilla
 */
public class Ejerciciosresuelto14 {

    public static void main(String[] args) {
    double numero,numero_cuadrado,numero_cubo;
    Scanner scanner =  new Scanner(System.in);
    
    System.out.println("Ingrese un numero: ");
    numero = scanner.nextDouble();
    numero_cuadrado = calculos14.calculo_cuadrado(numero);
    numero_cubo = calculos14.calculo_cubo(numero);
    System.out.println("El numero al cuadrado es: "+ numero_cuadrado);
    System.out.println("El numero al cubo es: " + numero_cubo);
    }
}
