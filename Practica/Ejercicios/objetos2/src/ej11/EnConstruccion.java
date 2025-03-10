package ej11;

public class EnConstruccion implements EtapaState{

	@Override
	public void aprobarEtapa(Proyecto p)
	{
		if(p.noEsCero())
		{
			p.setEtapa(new EnEvaluacion());
		}
		else
		{
			throw new RuntimeException("El precio del proyecto es 0");
		}
	}
	
	@Override
	public void modificarGanancia(Proyecto p, int ganancia)
	{
        if (ganancia >= 8 && ganancia <= 10) {
            p.setGanancia(ganancia);
        }
	}
	
}
