package test;

public class NaveTerrestre extends Nave{
	private int rodado;
	
	public NaveTerrestre(int combustible, int rodado) {
		super(combustible);
		this.rodado = rodado;
	}
	
	public String asString() {
		return super.asString() + " Terrestre";
	}


	public double velocidadMaxima() {
		return this.rodado * 1500 + 0.05 * this.combustible;
	}
	
	
	
}
