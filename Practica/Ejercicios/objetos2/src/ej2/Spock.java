package ej2;

public class Spock extends Estrategia{

	@Override
	public String vsPiedra() {
		return "Vaporiza";
	}

	@Override
	public String vsPapel() {
		return "Desaprobado";
	}

	@Override
	public String vsTijera() {
		return "Rompe";
	}
	
	@Override
	public String vsSpock() {
		return "Empate";
	}
	
	@Override
	public String vsLagarto() {
		return "Envenenado";
	}

	@Override
	public String getNombre() {
		return "Spock";
	}
	

}
