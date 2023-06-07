package test;

public abstract class Nave {
	protected int combustible;
	
	public Nave(int combustible) {
		this.combustible = combustible;
	}
	
	public String asString() {
		return "Soy una nave";
	}
	
	public abstract double velocidadMaxima();
}
