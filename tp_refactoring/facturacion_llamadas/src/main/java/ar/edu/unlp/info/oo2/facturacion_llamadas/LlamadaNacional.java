package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada{
	
	public LlamadaNacional(int duracion) {
		super(duracion);
	}
	
	public double getCostoPorMinuto() {
		return 3;
	}
	
}
