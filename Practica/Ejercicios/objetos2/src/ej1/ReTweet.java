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
	
}
