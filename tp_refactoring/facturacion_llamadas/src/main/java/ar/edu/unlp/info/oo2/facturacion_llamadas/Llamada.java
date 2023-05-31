package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {

	private Persoona emisor;
	private Persoona remitente;
	private int duracion;

	public Llamada(Persoona emisor, Persoona remitente, int duracion) {
		this.emisor= emisor;
		this.remitente= remitente;
		this.duracion = duracion;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public Persoona getEmisor() {
		return this.emisor;
	}
	public Persoona getRemitente() {
		return remitente;
	}
	
	public double calcularCosto() {
		return this.getDuracion() * this.getCostoPorMinuto() + (this.getDuracion() * this.getCostoPorMinuto() * this.getExtra());
	}
	
	public abstract double getCostoPorMinuto();
	
	public double getExtra() {
		return 0.21;
	}
	
}
