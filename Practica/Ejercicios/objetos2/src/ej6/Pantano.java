package ej6;

public class Pantano extends Pixel{

	private Agua agua;
	private Tierra tierra;
	
	@Override
	public double getValor() {
		return agua.getValorPantano(0.7)+tierra.getValorPantano(0.3);
	}
	
}
