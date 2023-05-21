package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	protected String tipoDeLlamada;
	private Persoona emisor;
	private Persoona remitente;
	private int duracion;
	
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public Llamada(Persoona emisor, Persoona remitente, int duracion) {
		this.emisor= emisor;
		this.remitente= remitente;
		this.duracion = duracion;
	}

	public void setTipoDeLlamada(String tipoDeLlamada) {
		this.tipoDeLlamada = tipoDeLlamada;
	}

	public Persoona getEmisor() {
		return this.emisor;
	}
	public Persoona getRemitente() {
		return remitente;
	}

	
	abstract public double calcularCosto();
	
	
}
