package ej1;

public abstract class Tweet {
	
	private Usuario usuario;
	
	public Tweet(Usuario usuario)
	{
		this.usuario=usuario;
	}
	
	public abstract String obtenerTexto();
	
	public boolean borrarSiSoyDe(Usuario u)
	{
		if(this.usuario.equals(u))
		{
			this.Matar();
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void Matar()
	{
		this.usuario.Matar(this);
	}
	
}
