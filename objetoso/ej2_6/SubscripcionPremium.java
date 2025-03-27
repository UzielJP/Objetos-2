package ej2_6;

public class SubscripcionPremium extends Subscripcion{

	@Override
	protected double costoExtra(Pelicula p) 
	{
		return 0;
	}

	@Override
	protected double porcentaje()
	{
		return 0.75;
	}
	
}
