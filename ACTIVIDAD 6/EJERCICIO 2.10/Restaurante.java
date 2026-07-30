/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurante;

/**
 *
 * @author Salome Castilla
 */
public class Restaurante {

    public static void main(String[] args) {
       System.out.println("--- RESULTADOS DEL EJERCICIO 2.10 ---");
        
        Pedido pedido1 = new Pedido();
        pedido1.calcularPedido("Sancocho", 5000, "Gaseosa", 2000);
        
        Pedido pedido2 = new Pedido();
        pedido2.calcularPedido("Crema de verduras", 5000, "Churrasco", 6000, "Gaseosa", 2000);
        
        Pedido pedido3 = new Pedido();
        pedido3.calcularPedido("Crema de espinacas", 5000, "Salmón", 10000, "Tiramisú", 5000, "Gaseosa", 2000);
    }
}
