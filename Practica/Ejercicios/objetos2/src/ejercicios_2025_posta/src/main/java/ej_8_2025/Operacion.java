package ej_8_2025;

public abstract class Operacion extends Estrategia{

	@Override
	public void mas(Calculadora c) 
	{
		c.setEstado(new Error());
	}

	@Override
	public void menos(Calculadora c) 
	{
		c.setEstado(new Error());
	}

	@Override
	public void dividir(Calculadora c) 
	{
		c.setEstado(new Error());	
	}

	@Override
	public void por(Calculadora c) 
	{
		c.setEstado(new Error());	
	}

}
