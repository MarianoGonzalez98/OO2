package ar.edu.unlp.info.oo1.tp_1_3_MediaPlayer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class PersonaTest {
	
	Media superAudio, unVideoFile,unVideoStream;

	MediaPlayer sistema;
	@BeforeEach
	
	void setUp() throws Exception {
		sistema = new MediaPlayer();
		superAudio = new Audio("oleeee");
		unVideoFile = new VideoFile("soy un videoo");
		unVideoStream = new VideoStreamAdapter("jeje soy un videoStream inmutable");
		sistema.addMedia(superAudio);
		sistema.addMedia(unVideoFile);
		sistema.addMedia(unVideoStream);
		
	}
	
    @Test
    public void testNombreCompleto() {
    	System.out.println(sistema.playMedias());
        assertEquals("Glosing, James", "Glosing, James");

    }
}
