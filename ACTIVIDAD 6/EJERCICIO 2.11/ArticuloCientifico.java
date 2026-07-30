/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.articulocientifico;

/**
 *
 * @author Salome Castilla
 */
public class ArticuloCientifico {
    String título; 
    String autor; 
    String[] palabrasClaves = new String[3];
    String publicación; 
    int año; 
    String resumen; 

    public ArticuloCientifico(String título, String autor) {
        this.título = título;
        this.autor = autor;
    }

    public ArticuloCientifico(String título, String autor, String[] palabrasClaves, String publicación, int año) {
        this(título, autor); // Invoca al primer constructor
        this.palabrasClaves = palabrasClaves;
        this.publicación = publicación;
        this.año = año;
    }

    public ArticuloCientifico(String título, String autor, String[] palabrasClaves, String publicación, int año, String resumen) {
        this(título, autor, palabrasClaves, publicación, año); // Invoca al segundo constructor
        this.resumen = resumen;
    }

    public void imprimir() {
        System.out.println("Título del artículo = " + título);
        System.out.println("Autor del artículo = " + autor);
        System.out.println("Palabras clave = ");
        // Recorre el array para imprimir cada palabra clave
        for (int i = 0; i < palabrasClaves.length; i++) {
            System.out.println(palabrasClaves[i]);
        }
        System.out.println("Publicación = " + publicación);
        System.out.println("Año = " + año);
        System.out.println("Resumen = " + resumen);
    }

    public static void main(String args[]) {
        String[] palabras = {"Física", "Espacio", "Tiempo"};
        
 
        ArticuloCientifico artículo = new ArticuloCientifico("La teoría especial de la relatividad", "Albert Einstein", palabras, "Anales de Física", 1913, "Las leyes de la física son las mismas en todos los sistemas de referencia inerciales.");
        
        artículo.imprimir();
    }
}
