package ej11;

public class Confirmada implements EtapaState
{
    @Override
    public void aprobarEtapa(Proyecto p) 
    {
        // No hace nada, ya está confirmada.
    }
    
	@Override
	public void modificarGanancia(Proyecto p, int ganancia)
	{
		 // No hace nada, ya está confirmada.
	}
}
