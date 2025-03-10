package ej3;

public class Temporario extends Tipo{

	private int hijos;
	private boolean casado;
	private int horas;
	
	public double adicional()
	{
		double total=0;
	
		if(this.casado)
		{
			total+=5000;
		}
		
		return total+2000*this.hijos;
	}
	
	public double basico()
	{
		return 20000+this.horas*300;
	}
	
}
