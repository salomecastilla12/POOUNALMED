/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio23;

/**
 *
 * @author Salome Castilla
 */
public class Automovil {
    String marca;
   int modelo;
   int motor;
   tipoCombus tipoCombustible;
   tipoA tipoAutomovil;
   int numeroPuertas;
   int cantidadAsientos;
   int velocidadMaxima;
   tipoColor color;
   int velocidadActual=0;
   
    Automovil(String marca, int modelo, int motor, tipoCombus tipoCombustible, tipoA tipoAutomovil, int numeroPuertas, int
    cantidadAsientos, int velocidadMaxima, tipoColor color) {
    this.marca = marca;
    this.modelo = modelo;
    this.motor = motor;
    this.tipoCombustible = tipoCombustible;
    this.tipoAutomovil = tipoAutomovil;
    this.numeroPuertas = numeroPuertas;
    this.cantidadAsientos = cantidadAsientos;
    this.velocidadMaxima = velocidadMaxima;
    this.color = color;
    }
    
        String getMarca() {
    return marca;
    }
        int getModelo() {
    return modelo;
    }
        int getMotor() {
    return motor;
    }
        tipoCombus getTipoCombustible() {
    return tipoCombustible;
    }


    tipoA getTipoAutomóvil() {
    return tipoAutomovil;
    }

    int getNúmeroPuertas() {
    return numeroPuertas;
    }

    int getCantidadAsientos() {
    return cantidadAsientos;
    }
    
        int getVelocidadMáxima() {
    return velocidadMaxima;
    }

    tipoColor getColor() {
    return color;
    }

    int getVelocidadActual() {
    return velocidadActual;
    }

    void setMarca(String marca) {
    this.marca = marca;
    }

    void setModelo(int modelo) {
    this.modelo = modelo;
    }
    
        void setMotor(int motor) {
    this.motor = motor;
    }

    void setTipoCombustible(tipoCombus tipoCombustible) {
    this.tipoCombustible = tipoCombustible;
    }

    void setTipoAutomóvil(tipoA tipoAutomovil) {
    this.tipoAutomovil = tipoAutomovil;
    }

    void setNúmeroPuertas(int numeroPuertas) {
    this.numeroPuertas = numeroPuertas;
    }

    void setCantidadAsientos(int cantidadAsientos) {
    this.cantidadAsientos = cantidadAsientos;
    }
    
        void setVelocidadMáxima(int velocidadMaxima) {
    this.velocidadMaxima = velocidadMaxima;
    }

    void setColor(tipoColor color) {
    this.color = color;
    }

    void setVelocidadActual(int velocidadActual) {
    this.velocidadActual = velocidadActual;
    }

    void acelerar(int incrementoVelocidad) {
    if (velocidadActual + incrementoVelocidad < velocidadMaxima) {

    velocidadActual = velocidadActual + incrementoVelocidad;
    } else { 
    System.out.println("No se puede incrementar a una velocidad superior a la maxima del automovil.");
    }
    }
        void desacelerar(int decrementoVelocidad) {

    if ((velocidadActual - decrementoVelocidad) > 0) {
    velocidadActual = velocidadActual - decrementoVelocidad;
    } else { 
    System.out.println("No se puede decrementar a una velocidadnegativa.");
    }
    }

    void frenar() {
    velocidadActual = 0;
    }

    double calcularTiempoLlegada(int distancia) {
    return distancia/velocidadActual;
    }

    void imprimir() {
    System.out.println("Marca ="  + marca);
    System.out.println("Modelo = " + modelo);
    System.out.println("Motor ="  + motor);
    System.out.println("Tipo de combustible = " + tipoCombustible);
    System.out.println("Tipo de automóvil = " + tipoAutomovil);
    System.out.println("Número de puertas = " + numeroPuertas);

    System.out.println("Cantidad de asientos = " +
    cantidadAsientos);
    System.out.println("Velocidad máxima = " + velocidadMaxima);
    System.out.println("Color = " + color);
}
 
}
