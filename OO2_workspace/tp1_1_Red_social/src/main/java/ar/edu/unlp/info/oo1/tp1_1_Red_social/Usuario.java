package ar.edu.unlp.info.oo1.tp1_1_Red_social;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private List<Tweet> tweets;
	private String screenName;
	
	public Usuario(String screenName) {
		this.screenName=screenName;
		tweets= new ArrayList<Tweet>();
	}
	
	public Tweet crearTweet(String texto) {
		if (texto.length()<1) {
			return null;
		}
		if (texto.length()>280) {
			return null;
		}
		
		Tweet tweet = new Tweet(texto);
		tweets.add(tweet);
		return tweet;
	}
	
	public Tweet retuitearTweet(Tweet tweet) {
		return tweet.retwitear();
	}

	public List<Tweet> getTweets() {
		return tweets;
	}

	public String getScreenName() {
		return screenName;
	}
	
	
}
