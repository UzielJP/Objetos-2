package ej2;

public class Papel extends Estrategia{

	@Override
	public String contra(Estrategia estrategia) 
	{
		return Estrategia.vsPapel();
	}
	
	@Override
	public String vsPiedra() {
		return "Cubre";
	}

	@Override
	public String vsPapel() {
		return "Empate";
	}

	@Override
	public String vsTijera() {
		return "Cortado";
	}
	
	@Override
	public String vsSpock() {
		return "Desaprueba";
	}
	
	@Override
	public String vsLagarto() {
		return "Comido";
	}

	@Override
	public String getNombre() {
		return "Papel";
	}

	
}
