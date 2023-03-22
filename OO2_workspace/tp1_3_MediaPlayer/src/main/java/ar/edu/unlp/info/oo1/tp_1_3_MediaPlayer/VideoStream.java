package ar.edu.unlp.info.oo1.tp_1_3_MediaPlayer;

public class VideoStream {

	private String contenido; 
	
	public VideoStream(String content) {
		contenido = "VideoStreamQueReproduce: "+content;
	}
	
	public String reproduce() {
		return contenido;
	}
}
