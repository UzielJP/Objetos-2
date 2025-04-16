package org.example;

public class Calculadora {
    private String valorAcumulado;
    private Operacion operacion;

    public Calculadora() {
        this.valorAcumulado = String.valueOf(0);
        this.operacion = new OperacionInicial();
    }

    public String getValorAcumulado() {
        return valorAcumulado;
    }

    public void setValorAcumulado(String valorAcumulado) {
        this.valorAcumulado = valorAcumulado;
    }

    public Operacion getOperacion() {
        return operacion;
    }

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    /**
     * Devuelve el resultado actual de la operación realizada.
     * Si no se ha realizado ninguna operación, devuelve el valor acumulado.
     * Si la calculadora se encuentra en error, devuelve “error”
     */
    public String getResultado() {
        return valorAcumulado;
    }


    /**
     * Pone en cero el valor acumulado y reinicia la calculadora
     */
    public void borrar() {
        this.setValorAcumulado(String.valueOf(0));
        this.setOperacion(new OperacionInicial());
    }


    /**
     * Asigna un valor para operar.
     * si hay una operación en curso, el valor será utilizado en la operación
     */
    public void setValor(double unValor) {
        this.operacion.setValor(unValor, this);
    }

    public void mas(){
        this.operacion.mas(this);
    }

    public void menos(){
        this.operacion.menos(this);
    }

    public void por(){
        this.operacion.por(this);
    }

    public void dividido(){
        this.operacion.dividido(this);
    }

}
