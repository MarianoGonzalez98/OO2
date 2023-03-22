package ar.edu.unlp.info.oo1.tp_1_3_MediaPlayer;

public class VideoStreamAdapter implements Media{
	private VideoStream _videoStream;

	VideoStreamAdapter(String content){
		_videoStream = new VideoStream(content);
	}
	
	
	public String play() {
		return _videoStream.reproduce();
	}
}
