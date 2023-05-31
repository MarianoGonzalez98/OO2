package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada{
	
	public LlamadaInternacional(Persoona emisor, Persoona remitente, int duracion) {
		super(emisor, remitente, duracion);
	}
	
	public double getCostoPorMinuto() {
		return 200;
	}

}
