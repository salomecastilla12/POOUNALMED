/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioresuelto4;

/**
 *
 * @author Salome Castilla
 */
public class Ejercicioresuelto4 {
    public  static void main(String[] args) {
        double edjuan = 9;
        double edalber , edana , edmama ;
        edalber = Edades.calcular_edalber(edjuan);
        edana = Edades.calcular_edana(edjuan);
        edmama = Edades.calcular_edmama(edjuan, edana, edalber);
        System.out.println("Las edades son; Alberto=" + edalber + " Juan= " + edjuan + " Ana= " + edana + " Mama= " + edmama) ;   
    }
}
