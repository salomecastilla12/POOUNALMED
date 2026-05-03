/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejer2.pag86;


public class TrianguloRectangulo {
        int baseT; // Atributo que define la base de un triángulo rectángulo
        int alturaT; // Atributo que define la altura de un triángulo rectángulo

    public TrianguloRectangulo(int baseT, int alturaT) {
        this.baseT = baseT;
        this.alturaT = alturaT;
    }

    double calcularArea() {
        return (baseT * alturaT / 2);
    }
    
    double calcularPerímetro() {
        return (baseT + alturaT + calcularHipotenusa());
    }
    
    double calcularHipotenusa() {
        return Math.pow(baseT*baseT + alturaT*alturaT, 0.5);
    }
    
    void determinarTipoTriangulo() {
        if ((baseT == alturaT) && (baseT == calcularHipotenusa()) && (alturaT== calcularHipotenusa()))
            System.out.println("Es un triangulo equilatero");

        else if ((baseT != alturaT) && (baseT != calcularHipotenusa()) && (alturaT != calcularHipotenusa()))
            System.out.println("Es un triangulo escaleno"); 
        
        else
            System.out.println("Es un triangulo isosceles");
    }
}

