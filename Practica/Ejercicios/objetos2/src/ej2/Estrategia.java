package ej2;

public class abstract Estrategia {
	
	private Estrategia estrategia;
	
	public Estrategia(Estrategia estrategia)
	{
		this.estrategia = estrategia;
	}
	
	public String contra(Estrategia estrategia);
	public abstract String vsPiedra();
	public abstract String vsPapel();
	public abstract String vsTijera();
	public abstract String vsSpock();
	public abstract String vsLagarto();
	public abstract String getNombre();
	
}
