package ej9;

public abstract class ExcursionState {

	public abstract void inscribir(Excursion excursion, Usuario usuario);
	
	public String obtenerInformacion(Excursion excursion)
	{
		return excursion.toString();
	}
	
}
