package ej6;

public abstract class Pixel implements Celda{

	
	public double proporcion()
	{
		return this.getValor();
	}
	
	public int totalHijos()
	{
		return 1;
	}
	
	public abstract double getValor();
	
	public double getValorPantano(double cantidad)
	{
		return this.getValor()*cantidad;
	}
	
}
