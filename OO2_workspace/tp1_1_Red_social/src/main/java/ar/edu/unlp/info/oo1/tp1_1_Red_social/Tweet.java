package ar.edu.unlp.info.oo1.tp1_1_Red_social;

import java.util.List;

public class Tweet {
	private String texto;
	private Tweet tweetOrigen;
	private List<Tweet> tweetsQueRetuitearon;
	
	
	public Tweet(String texto) {
		this.texto = texto;
	}
	
	
	//constructor que se usa en retweet
	public Tweet(String texto, Tweet tweetOrigen) {
		this(texto);
		this.tweetOrigen = tweetOrigen;
	}
	
	
	//devuelve el nuevo tweet
	public Tweet retwitear() {
		return new Tweet(texto,this);
		
	}
	
	//elimino todos los tweets que retwitearon el tweet eliminado
	public void eliminar() {
		//me elimino de los tweets que me retuitearon
		tweetsQueRetuitearon.forEach( t -> t.eliminar());
		
	}
	
	public void eliminarTweetOrigen() {
		this.tweetOrigen = null;
	}
}
