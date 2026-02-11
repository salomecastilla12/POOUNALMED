package com.mycompany.ejercicioresuelto12;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Salome Castilla
 */
public class calculo_rete {
      
        static double calporceretencion(double retencion){
        double porcentaje_retefuente= retencion/100;
        return porcentaje_retefuente;
    }
        static double cal_sala_bruto(double horas_trabajadas,double valor_hora){
        double salario_bruto = horas_trabajadas*valor_hora;
        return salario_bruto;
    }
    static double cal_retencion(double porcentaje_retefuente,double salario_bruto){
        double valor_retefuente= porcentaje_retefuente*salario_bruto;
        return valor_retefuente;
    }
    static double salario_neto(double salario_bruto,double valor_retefuente){
        double salario_neto=salario_bruto- valor_retefuente;
        return salario_neto;
    }
}
