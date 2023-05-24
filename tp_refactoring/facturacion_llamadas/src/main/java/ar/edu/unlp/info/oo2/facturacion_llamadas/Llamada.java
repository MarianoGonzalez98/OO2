package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {

	private int duracion;

	public Llamada(int duracion) {
		this.duracion = duracion;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public double calcularCosto() {
		return this.getDuracion() * this.getCostoPorMinuto() + (this.getDuracion() * this.getCostoPorMinuto() * this.getExtra());
	}
	
	public abstract double getCostoPorMinuto();
	
	public double getExtra() {
		return 0.21;
	}
	
}
