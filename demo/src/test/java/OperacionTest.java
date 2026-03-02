package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperacionTest {
    @Test
    public void testSumar() {
        Operacion op = new Operacion(5, 3);
        assertEquals(8, op.sumar(), "La suma debe ser 8");
    }

    @Test
    public void testMultiplicar() {
        Operacion op = new Operacion(4, 2);
        assertEquals(8, op.multiplicar(), "La multiplicación debe ser 8");
    }
}