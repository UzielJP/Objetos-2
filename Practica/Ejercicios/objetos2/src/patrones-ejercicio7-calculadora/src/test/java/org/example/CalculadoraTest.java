package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();

    }

    @Test
    void mas() {
        calculadora.setValor(5);
        calculadora.mas();
        calculadora.setValor(20);
        assertEquals("25.0", calculadora.getResultado());
    }

    @Test
    void menos() {
        calculadora.setValor(30);
        calculadora.menos();
        calculadora.setValor(25);
        assertEquals("5.0", calculadora.getResultado());
    }

    @Test
    void por() {
        calculadora.setValor(5);
        calculadora.por();
        calculadora.setValor(6);
        assertEquals("30.0", calculadora.getResultado());
    }

    @Test
    void dividido() {
        calculadora.setValor(10);
        calculadora.dividido();
        calculadora.setValor(5);
        assertEquals("2.0", calculadora.getResultado());
    }

    @Test
    void error() {
        calculadora.setValor(10);
        calculadora.dividido();
        calculadora.mas();
        assertEquals("Error", calculadora.getResultado());
    }
}