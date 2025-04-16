package ej_8_2025;

public class Error extends Estrategia
{

	@Override
	public void setValor(Calculadora c, double v) 
	{
		c.getResultado();
	}

	@Override
	public void mas(Calculadora c) 
	{
		c.getResultado();	
	}

	@Override
	public void menos(Calculadora c) 
	{
		c.getResultado();	
	}

	@Override
	public void dividir(Calculadora c) 
	{
		c.getResultado();	
	}

	@Override
	public void por(Calculadora c) 
	{
		c.getResultado();
	}

	@Override
	public String getResultado(Calculadora c) 
	{
		return "Error";
	}
	
}
