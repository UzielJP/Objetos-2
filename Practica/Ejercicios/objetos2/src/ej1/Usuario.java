package ej1;

import java.util.List;

public class Usuario {

	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario(String screenName)
	{
		this.screenName=screenName;
	}
	
	public void nuevoTweet(Tweet tweet)
	{
		this.tweets.add(tweet);
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
