package ej2;

public class Tijera extends Estrategia{

	@Override
	public String contra(Estrategia estrategia) 
	{
		return Estrategia.vsTijera();
	}
	
	@Override
	public String vsPiedra() {
		return "Aplastado";
	}

	@Override
	public String vsPapel() {
		return "Corta";
	}

	@Override
	public String vsTijera() {
		return "Empate";
	}

	@Override
	public String vsSpock() {
		return "Roto";
	}
	
	@Override
	public String vsLagarto() {
		return "Decapita";
	}
	
	@Override
	public String getNombre() {
		return "Tijera";
	}
	
}
