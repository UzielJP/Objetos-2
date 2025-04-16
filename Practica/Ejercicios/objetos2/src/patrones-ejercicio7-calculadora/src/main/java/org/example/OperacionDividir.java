package org.example;

public class OperacionDividir extends OperacionComun {

    public void setValor(double unValor, Calculadora calculadora) {
        if (unValor == 0) {
            calculadora.setValorAcumulado("Error");
        } else {
            calculadora.setValorAcumulado(String.valueOf(Double.parseDouble(calculadora.getValorAcumulado()) / unValor));
            calculadora.setOperacion(new OperacionInicial());
        }
    }
}
