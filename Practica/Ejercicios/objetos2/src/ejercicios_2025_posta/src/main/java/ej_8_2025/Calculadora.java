package ej_8_2025;

public class Calculadora {

	private double valor;
	private Estrategia estado;
	
	public String getResultado()
	{
		return estado.getResultado(this);
	}
	
	public void setValor(double v)
	{
		this.valor=v;
	}
	
	public double getValor()
	{
		return this.valor;
	}
	
	public void setEstado(Estrategia e)
	{
		this.estado=e;
	}
	
	public void borrar()
	{
		this.estado= new Inicial();
		this.valor = 0;
	}
	
	public void setValor()
	{
		this.estado.setValor(this, valor);
	}
	
	public void mas()
	{
		this.estado.mas(this);
	}
	
	public void menos()
	{
		this.estado.menos(this);
	}
	
	public void dividir()
	{
		this.estado.dividir(this);
	}
	
	public void por()
	{
		this.estado.por(this);
	}
}
