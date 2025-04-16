package ej_8_2025;

public abstract class Estrategia {

	public String getResultado(Calculadora c)
	{
		return Double.toString(c.getValor());
	}
	
	public abstract void setValor(Calculadora c, double v);
	public abstract void mas(Calculadora c);
	public abstract void menos(Calculadora c);
	public abstract void dividir(Calculadora c);
	public abstract void por(Calculadora c);
	
}
