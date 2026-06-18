/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio418;

/**
 *
 * @author Salome Castilla
 */
public class EquipoMaraton {
    
    String nombreEquipo;
    String universidad;
    String lenguajeProgramacion;
    
    programador[]programadores;
    int tamañoEquipo;
    
 EquipoMaraton(String nombreEquipo, String universidad, String lenguajeProgramacion){
this.nombreEquipo = nombreEquipo;
    this.universidad = universidad; // ¡Corregido! Antes decías this.universidad = this.universidad
    this.lenguajeProgramacion = lenguajeProgramacion; // ¡Corregido!
    this.tamañoEquipo = 0; 
    this.programadores = new programador[4]; // ¡Cambiado a 4 para que coincida con tu interfaz!

 }
 
 boolean estáLleno() {
    return tamañoEquipo == programadores.length;
}
 
 void añadir(programador programador) throws Exception {
if (estáLleno()== true) {
throw new Exception ("El equipo está completo. No se pudoagregar programador.");
}

programadores[tamañoEquipo] = programador;
    tamañoEquipo=tamañoEquipo + 1; // Se incrementa el tamaño del equipo
}
 
 static void validarCampo(String campo) throws Exception {
for (int j = 0; j < campo.length(); j++) {
    char c = campo.charAt(j);
    if (Character.isDigit(c)) { 
        throw new Exception("El nombre no puede tener dígitos.");
    }
}
 
if (campo.length() > 20) {
    throw new Exception("La longitud no debe ser superior a 20 caracteres.");
}

}
 
}
