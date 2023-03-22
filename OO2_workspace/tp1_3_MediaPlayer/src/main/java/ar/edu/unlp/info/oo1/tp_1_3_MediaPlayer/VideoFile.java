package ar.edu.unlp.info.oo1.tp_1_3_MediaPlayer;

public class VideoFile implements Media{
	private String contenido; 
	
	public VideoFile(String content) {
		contenido = "VideoFile: "+content;
	}
	
	public String play() {
		return contenido;
	}
}

