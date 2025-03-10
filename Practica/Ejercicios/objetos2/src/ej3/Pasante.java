package ej3;

public class Pasante extends Tipo{

	private int examen;
	
	public double adicional()
	{
		return this.examen*2000;
	}
	
	public double basico()
	{
		return 20000;
	}
	
}
