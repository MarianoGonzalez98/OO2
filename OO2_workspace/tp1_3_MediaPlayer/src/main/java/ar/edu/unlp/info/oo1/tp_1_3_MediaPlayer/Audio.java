package ar.edu.unlp.info.oo1.tp_1_3_MediaPlayer;

public class Audio implements Media {
	private String contenido; 
	
	public Audio(String content) {
		contenido = "Audio: "+content;
	}
	
	public String play() {
		return contenido;
	}
}
