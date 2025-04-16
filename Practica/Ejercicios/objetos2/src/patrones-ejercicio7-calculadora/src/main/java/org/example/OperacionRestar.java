package org.example;

public class OperacionRestar extends OperacionComun{

    public void setValor(double unValor, Calculadora calculadora) {
        calculadora.setValorAcumulado(String.valueOf(Double.parseDouble(calculadora.getValorAcumulado()) - unValor));
        calculadora.setOperacion(new OperacionInicial());
    }
}
