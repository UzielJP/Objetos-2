package ej11;

public class EnEvaluacion implements EtapaState{

	@Override
	public void aprobarEtapa(Proyecto p)
	{
		p.setEtapa(new Confirmada());
	}
	
	@Override
	public void modificarGanancia(Proyecto p, int ganancia)
	{
        if (ganancia >= 11 && ganancia <= 15) {
            p.setGanancia(ganancia);
        }
	}
	
}
