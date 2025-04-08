package ej3;

public class Temporario extends Empleado{

	private int hijos;
	private boolean casado;
	private int horas;

	@Override
	public double adicional()
	{
		double total=0;
	
		if(this.casado)
		{
			total+=5000;
		}
		
		return total+2000*this.hijos;
	}

	@Override
	public double basico()
	{
		return 20000+this.horas*300;
	}
	
}
