package ar.edu.unlp.info.oo1.Topografias;

public abstract class Parte extends Topografia{
	private double proporcionAgua;
	
	public Parte(double proporcionAgua) {
		this.proporcionAgua = proporcionAgua;
	}
	
	public double getProporcionAgua() {
		return proporcionAgua;
	}
	
	public double getProporcionTierra() {
		return 1.0-proporcionAgua;
	}
}
