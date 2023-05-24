package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada{
	
	public LlamadaInternacional(int duracion) {
		super(duracion);
	}
	
	public double getCostoPorMinuto() {
		return 200;
	}

}
