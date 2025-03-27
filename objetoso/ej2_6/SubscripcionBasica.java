package ej2_6;

public class SubscripcionBasica extends Subscripcion{

	@Override
	protected double costoExtra(Pelicula p) 
	{
		return p.calcularCargoExtraPorEstreno();
	}

}
