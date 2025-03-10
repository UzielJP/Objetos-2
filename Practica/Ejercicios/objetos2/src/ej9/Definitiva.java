package ej9;

public class Definitiva extends ExcursionState{

	@Override
	public void inscribir(Excursion excursion, Usuario usuario) 
	{
		excursion.agregarLista(usuario);
		if(excursion.cupoMaximo())
		{
			excursion.setState(new Definitiva());
		}	
	}

	@Override
	public String obtenerInformacion(Excursion excursion)
	{
		return super.obtenerInformacion(excursion)+". "+excursion.getMails()+". "+excursion.faltanteMaximo();
	}
}
