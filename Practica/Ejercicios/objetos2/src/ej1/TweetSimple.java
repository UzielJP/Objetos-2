package ej1;

public class TweetSimple implements Tweet{

	private String texto;
	
	public TweetSimple(String texto)
	{
		
		if(texto.length()>=1&&texto.length()<=250)
		{
			this.texto=texto;
		}
		else
		{
			throw new IllegalArgumentException("El Texto debe tener un tamaño entre 1 y 250 caracteres.");
		}
		
	}
	
	public String obtenerTexto()
	{
		return this.texto;
	}
	
}
