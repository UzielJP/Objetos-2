package ej1;

import java.util.List;

public class Twitter {
	
	private List<Usuario> usuarios;
	
	public void crearNuevoUsuario(String screenName)
	{
		
		if(this.usuarios.stream().filter(a->a.mismoScreenName(screenName)).toList().isEmpty())
		{
			this.usuarios.add(new Usuario(screenName));
		}
		
	}
	
	public void eliminarUsuario(Usuario usuario)
	{
		if(this.usuarios.contains(usuario))
		{
			this.usuarios.stream().forEach(a-> a.borrarTweetsDe(u));
			usuario.eliminarTweets();
			this.usuarios.remove(usuario);
		}
		else
		{
			throw new IllegalArgumentException("Usuario Inexistente");
		}
	
	}
	
}
