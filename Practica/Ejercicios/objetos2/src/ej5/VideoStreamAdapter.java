package ej5;

public class VideoStreamAdapter implements Media{

	private VideoStream videoStream;
	
	@Override
	public void play()
	{
		this.videoStream.reproduce();
	}
	
}
