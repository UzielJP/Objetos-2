package ej2;

public class Piedra extends Estrategia{
	
	@Override
	public String contra(Estrategia estrategia) 
	{
		return Estrategia.vsPiedra();
	}
	
	@Override
	public String vsPiedra() {
		return "Empate";
	}

	@Override
	public String vsPapel() {
		return "Cubierto";
	}

	@Override
	public String vsTijera() {
		return "Aplasta";
	}

	@Override
	public String vsSpock() {
		return "Vaporizado";
	}
	
	@Override
	public String vsLagarto() {
		return "Aplasta";
	}
	
	@Override
	public String getNombre() {
		return "Piedra";
	}
	
}
