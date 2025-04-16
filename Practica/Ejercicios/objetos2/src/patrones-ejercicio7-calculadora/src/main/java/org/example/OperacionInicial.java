package org.example;

public class OperacionInicial implements Operacion{

    public void setValor(double unValor, Calculadora calculadora) {
        calculadora.setValorAcumulado(String.valueOf(unValor));
    }

    public void mas(Calculadora calculadora) {
        calculadora.setOperacion(new OperacionSumar());
    }

    public void menos(Calculadora calculadora) {
        calculadora.setOperacion(new OperacionRestar());
    }

    public void por(Calculadora calculadora) {
        calculadora.setOperacion(new OperacionMultiplicar());
    }

    public void dividido(Calculadora calculadora) {
        calculadora.setOperacion(new OperacionDividir());
    }
}
