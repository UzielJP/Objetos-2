package ej3;

public class Planta extends Empleado{
	
	private int antiguedad;
	
	public double adicional()
	{
		return super.adicional()+this.antiguedad*2000;
	}
	
	public double basico()
	{
		return 50000;
	}
	
}
