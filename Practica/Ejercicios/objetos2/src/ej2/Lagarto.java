package ej2;

public class Lagarto extends Estrategia{

	@Override
	public String contra(Estrategia estrategia) 
	{
		return Estrategia.vsLagarto();
	}
	
	@Override
	public String vsPiedra() {
		return "Aplastado";
	}

	@Override
	public String vsPapel() {
		return "Come";
	}

	@Override
	public String vsTijera() {
		return "Decapitado";
	}
	
	@Override
	public String vsSpock() {
		return "Envenena";
	}
	
	@Override
	public String vsLagarto() {
		return "Empate";
	}

	@Override
	public String getNombre() {
		return "Lagarto";
	}
	
}
