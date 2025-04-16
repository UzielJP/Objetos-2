package org.example;

public abstract class OperacionComun implements Operacion {

    public void mas(Calculadora calculadora) {
        calculadora.setValorAcumulado("Error");
        calculadora.setOperacion(new OperacionError());
    }

    public void menos(Calculadora calculadora) {
        calculadora.setValorAcumulado("Error");
        calculadora.setOperacion(new OperacionError());
    }

    public void por(Calculadora calculadora) {
        calculadora.setValorAcumulado("Error");
        calculadora.setOperacion(new OperacionError());
    }

    public void dividido(Calculadora calculadora) {
        calculadora.setValorAcumulado("Error");
        calculadora.setOperacion(new OperacionError());
    }
}
