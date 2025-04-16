package ej_9_2025;

public class AutoEnAlquiler {

	private double precioPorDia;
	private int cantidadDeDias;
	private String marca;
	private PoliticaCancelacion cancelacion;
	
	public void setCancelacion(PoliticaCancelacion c)
	{
		this.cancelacion=c;
	}
	
	public double monto(double dias)
	{
		return this.precioPorDia*dias;
	}
	
	public double reembolso(long d, double monto)
	{
		return cancelacion.reembolso(d, monto);
	}
}
