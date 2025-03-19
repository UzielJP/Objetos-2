package ej1;

import java.util.List;

public class Usuario {

	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario(String screenName)
	{
		this.screenName=screenName;
	}
	
	public void nuevoTweet(String texto)
	{
		if(texto.length()>=1&&texto.length()<=250)
		{
			this.tweets.add(new Tweet(texto));
		}
		else
		{
			throw new IllegalArgumentException("El Texto debe tener un tamaño entre 1 y 250 caracteres.");
		}
	}

	public void nuevoReTweet(Tweet tweet)
	{
		this.tweets.add(new ReTweet(tweet));
	}
	
	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	public boolean mismoScreenName(String screenName)
	{
		return this.screenName.equals(screenName);
	}
	
	public void eliminarTweets()
	{
		this.tweets.removeAll(tweets);
	}
}
