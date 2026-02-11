/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioresuelto12;

/**
 *
 * @author Salome Castilla
 */
import java.util.Scanner;
public class Ejercicioresuelto12 {

    public static void main(String[] args) {
        double horas_trabajadas,valor_hora,retencion,salario_bruto, salario_neto, porcentaje_retefuente, valor_retefuente;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero para las horas trabajadas: ");
        horas_trabajadas = scanner.nextDouble();
        System.out.println("Ingresa el valor de la hora de trabajo: ");
        valor_hora = scanner.nextDouble();
        System.out.println("Ingresa un numero entero de retencion:");
        retencion = scanner.nextDouble();
        
        porcentaje_retefuente = calculo_rete.calporceretencion( retencion);
        salario_bruto = calculo_rete.cal_sala_bruto( horas_trabajadas, valor_hora);
        valor_retefuente = calculo_rete.cal_retencion( porcentaje_retefuente, salario_bruto);
        salario_neto = calculo_rete.salario_neto( salario_bruto, valor_retefuente);

       
       System.out.println("Salario bruto es: " + salario_bruto);
       System.out.println("Retencion en la fuente es: " + valor_retefuente);
       System.out.println("Salario Neto es: " + salario_neto);
       
    }
}
