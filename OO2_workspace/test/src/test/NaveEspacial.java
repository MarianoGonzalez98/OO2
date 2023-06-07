package test;

public class NaveEspacial extends Nave{

	private int altitudMaxima;
	private float factorAerodinamico;
	
	public NaveEspacial(int combustible, int altitudMaxima, float factorAerodinamico) {
		super(combustible);
		this.altitudMaxima = altitudMaxima;
		this.factorAerodinamico = factorAerodinamico;
	}
	
	public String asString() {
		return super.asString() + " Espacial";
	}

	public double velocidadMaxima() {
		return this.altitudMaxima * this.factorAerodinamico;
	}

}
