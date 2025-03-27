package ej2_6;

public class SubscripcionFamiliar extends Subscripcion{

	@Override
	protected double costoExtra(Pelicula p) {
		return p.calcularCargoExtraPorEstreno();
	}

	@Override
	protected double porcentaje()
	{
		return 0.90;
	}
}
