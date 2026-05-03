/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejer2.pag86;
import java.util.Scanner;

public class Ejer24pag86 {

    public static void main(String[] args) {
        int radio;
        int base;
        int altura;
        int longitud;
        int baseT;
        int alturaT;
        
        Scanner datos_entrada = new Scanner(System.in);
        
        System.out.println("ingrese el radio del circulo en centimetros: ");
        radio = datos_entrada.nextInt();
        
        System.out.println("ingrese la base del retangulo en centimetros: ");
        base = datos_entrada.nextInt();
        
        System.out.println("ingrese la altura del retangulo en centimetros: ");
        altura = datos_entrada.nextInt();
        
        System.out.println("ingrese la longitud del cuadrado en centimetros: ");
        longitud = datos_entrada.nextInt();
        
        System.out.println("ingrese la base del triangulo retangulo en centimetros: ");
        baseT = datos_entrada.nextInt();
        
        System.out.println("ingrese la altura del triangulo retangulo en centimetros: ");
        alturaT = datos_entrada.nextInt();
        
        Circulo figura1 = new Circulo(radio);
        Rectangulo figura2 = new Rectangulo(base,altura);
        Cuadrado figura3 = new Cuadrado(longitud);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(baseT,alturaT);
        System.out.println("El area del circulo es = " + figura1.calcularArea());
        System.out.println("El perimetro del circulo es = " + figura1.calcularPerímetro());
        System.out.println();
        System.out.println("El area del rectangulo es = " + figura2.calcularArea());
        System.out.println("El perimetro del rectangulo es = " + figura2.calcularPerímetro());
        System.out.println();
        System.out.println("El area del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perimetro del cuadrado es = " + figura3.calcularPerímetro());
        System.out.println();
        System.out.println("El area del triangulo es ="  + figura4.calcularArea());
        System.out.println("El perimetro del triangulo es = " + figura4.calcularPerímetro());
        figura4.determinarTipoTriangulo();
    }
}
