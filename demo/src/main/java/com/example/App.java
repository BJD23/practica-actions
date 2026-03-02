package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("¡Iniciando calculadora!");
        Operacion op = new Operacion(10, 5);
        
        System.out.println("Suma: " + op.sumar());
        System.out.println("División: " + op.dividir());
    }
}