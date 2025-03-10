package ej9;

public class Completa extends ExcursionState{

	@Override
	public void inscribir(Excursion excursion, Usuario usuario) 
	{
		excursion.agregarListaEspera(usuario);
	}
	
}
