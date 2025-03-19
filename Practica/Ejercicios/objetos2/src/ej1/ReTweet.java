package ej1;

public class ReTweet extends Tweet{

	private Tweet tweet;
	
	public ReTweet(TweetSimple tweetSimple)
	{
		this.tweetSimple=tweetSimple;
	}
	
	public String obtenerTexto()
	{
		return this.tweet.obtenerTexto();
	}
	
	@Override
	public boolean borrarSiSoyDe(Usuario u)
	{
		if(this.tweet.borrarSiSoyDe(u))
		{
			this.Matar();
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
