package ej19;

public class Personaje 
{

	private String nombre;
	private int vida;
	private Arma arma;
	private Armadura armadura;
	
	public void combatir(Personaje p)
	{
		p.defender(this.atacar(p));
		this.defender(p.atacar(this));
	}

	public int atacar(Personaje p)
	{
		return this.arma.atacar(p);
	}
	
	public void defender(int d)
	{
		this.vida-=d;
	}
	
	public void setArma(Arma arma) 
	{
		this.arma = arma;
	}

	public Armadura getArmadura() 
	{
		return armadura;
	}

	public void setArmadura(Armadura armadura) 
	{
		this.armadura = armadura;
	}
	
	public boolean igual(String s)
	{
		return this.armadura.igual(s);
	}
	
}
