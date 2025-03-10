package ej19;

public abstract class Arma 
{

	public int atacar(Personaje p)
	{
		if(p.igual("ArmaduraDeCuero"))
		{
			return this.vsArmaduraDeCuero();
		}
		if(p.igual("ArmaduraDeHierro"))
		{
			return this.vsArmaduraDeHierro();
		}
		if(p.igual("ArmaduraDeAcero"))
		{
			return this.vsArmaduraDeAcero();
		}
		return 0;
	}
	
	public abstract int vsArmaduraDeCuero();
	public abstract int vsArmaduraDeHierro();
	public abstract int vsArmaduraDeAcero();
	
}
