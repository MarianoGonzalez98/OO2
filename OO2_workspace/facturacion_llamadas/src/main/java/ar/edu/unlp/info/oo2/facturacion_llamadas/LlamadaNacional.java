package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada{

	public LlamadaNacional(Persoona emisor, Persoona remitente, int duracion) {
		super(emisor, remitente, duracion);
		// TODO Auto-generated constructor stub
	}


	public double calcularCosto() {
		// TODO Auto-generated method stub
		return this.getDuracion() *3 + (this.getDuracion()*3*0.21);
	}
	
	





}
