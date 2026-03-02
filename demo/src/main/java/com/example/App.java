package com.example;

import com.example.Operacion;

public class App {
    public static void main(String[] args) {
        System.out.println("¡Iniciando calculadora!");
        Operacion op = new Operacion(10, 5);
        
        System.out.println("Suma de 10 y 5: " + op.sumar());
        System.out.println("División de 10 y 5: " + op.dividir());
    }
}