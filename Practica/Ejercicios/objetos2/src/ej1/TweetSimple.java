package ej1;

public class TweetSimple extends Tweet{

	private String texto;
	
	public TweetSimple(String texto)
	{
			this.texto=texto;
	}
	
	public String obtenerTexto()
	{
		return this.texto;
	}
	
}
