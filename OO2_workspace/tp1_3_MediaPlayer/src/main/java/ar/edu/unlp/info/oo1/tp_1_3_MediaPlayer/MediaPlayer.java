package ar.edu.unlp.info.oo1.tp_1_3_MediaPlayer;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
	
	List<Media> medias;
	public MediaPlayer() {
		medias = new ArrayList<>();
	}
	
	public void addMedia(Media media) {
		medias.add(media);
	};
	
	public String playMedias() {
		String result = "Medias: ";
		medias.forEach(m -> System.out.println(m.play()));
		return result;
	}
}
