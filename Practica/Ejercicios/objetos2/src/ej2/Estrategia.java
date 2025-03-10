package ej2;

public abstract class Estrategia {
	
	
	public String jugar(Estrategia estrategia)
	{
		
		if(estrategia instanceof Piedra)
		{
			return this.getNombre()+" "+this.vsPiedra()+" vs "+estrategia.getNombre();
		}
		
		if(estrategia instanceof Tijera)
		{
			return this.getNombre()+" "+this.vsTijera()+" vs "+estrategia.getNombre();
		}

		if(estrategia instanceof Papel)
		{
			return this.getNombre()+" "+this.vsPapel()+" vs "+estrategia.getNombre();
		}
		
        if (estrategia instanceof Spock) {
            return this.getNombre() + " " + this.vsSpock() + " vs " + estrategia.getNombre();
        }

        if (estrategia instanceof Lagarto) {
            return this.getNombre() + " " + this.vsLagarto() + " vs " + estrategia.getNombre();
        }
        
		return null;
		
	}
	
	public abstract String vsPiedra();
	public abstract String vsPapel();
	public abstract String vsTijera();
	public abstract String vsSpock();
	public abstract String vsLagarto();
	public abstract String getNombre();
	
	
}
