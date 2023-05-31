package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada{
	
	public LlamadaNacional(Persoona emisor, Persoona remitente, int duracion) {
		super(emisor, remitente, duracion);
	}
	
	public double getCostoPorMinuto() {
		return 3;
	}
	
}
