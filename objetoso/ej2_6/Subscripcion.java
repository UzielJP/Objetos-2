package ej2_6;

public abstract class Subscripcion {

	public double costo(Pelicula p)
	{
	    return (p.getCosto() + this.costoExtra(p))* this.porcentaje();
	}
	
	protected abstract double costoExtra(Pelicula p);
	
	protected double porcentaje()
	{
		return 1;
	}
}
