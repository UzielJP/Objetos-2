package ej1;

public class ReTweet implements Tweet{

	private TweetSimple tweetSimple;
	
	public ReTweet(TweetSimple tweetSimple)
	{
		this.tweetSimple=tweetSimple;
	}
	
	public String obtenerTexto()
	{
		return this.tweetSimple.obtenerTexto();
	}
	
}
