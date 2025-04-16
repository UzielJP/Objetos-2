package ej_8_2025;

public class Inicial extends Estrategia
{

	@Override
	public void mas(Calculadora c) 
	{
		c.setEstado(new Mas());	
	}

	@Override
	public void menos(Calculadora c) 
	{
		c.setEstado(new Menos());
		
	}

	@Override
	public void dividir(Calculadora c) {
		c.setEstado(new Dividir());
		
	}

	@Override
	public void por(Calculadora c) 
	{
		c.setEstado(new Por());	
	}

	@Override
	public void setValor(Calculadora c, double v) 
	{
		c.setValor(v);
	}

}
