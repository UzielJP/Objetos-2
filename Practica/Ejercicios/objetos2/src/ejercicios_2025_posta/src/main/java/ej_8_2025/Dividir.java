package ej_8_2025;

public class Dividir extends Operacion{

	@Override
	public void setValor(Calculadora c, double v) 
	{
		if(v==0)
		{
			c.setEstado(new Error());
		}
		c.setValor(c.getValor()/v);
		c.setEstado(new Inicial());
	}
	
}
