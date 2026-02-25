/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio21;
import java.util.Scanner;
/**
 *
 * @author Salome Castilla
 */
public class EJERCICIO21 {

    public static void main(String[] args) {
        String nombre;
        String apellidos;
        String numeroDocumentoIdentidad;
        int anoNacimiento;
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Ingrese el nombre: ");
        nombre=entrada.next();
        
        System.out.println("Ingrese el apellidos: ");
        apellidos=entrada.next();
        
        System.out.println("Ingrese el numero de Documento de Identidad: ");
        numeroDocumentoIdentidad=entrada.next();
        
        System.out.println("Ingrese el año de Nacimeinto: ");
        anoNacimiento=entrada.nextInt();
        
        
        Persona persona1= new Persona(nombre,apellidos,numeroDocumentoIdentidad,anoNacimiento);
        
        persona1.imprimir();
     
    }
}
