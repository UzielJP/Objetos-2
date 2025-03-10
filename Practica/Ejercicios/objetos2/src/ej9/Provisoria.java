package ej9;

public class Provisoria extends ExcursionState{

	@Override
	public void inscribir(Excursion excursion, Usuario usuario) 
	{
		excursion.agregarLista(usuario);
		if(excursion.cupoMinimo())
		{
			excursion.setState(new Definitiva());
		}	
	}

	@Override
	public String obtenerInformacion(Excursion excursion)
	{
		return super.obtenerInformacion(excursion)+excursion.faltanteMinimo();
	}
	
}
