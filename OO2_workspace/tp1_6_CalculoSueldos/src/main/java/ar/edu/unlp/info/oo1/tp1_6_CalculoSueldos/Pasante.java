package ar.edu.unlp.info.oo1.tp1_6_CalculoSueldos;

public class Pasante extends Empleado{
	private int examenesRendidos;
	
	public Pasante(int examenesRendidos) {
		this.examenesRendidos = examenesRendidos;
	}
	
	protected double sueldoAdicional() {
		return examenesRendidos * 2000;
	}
}
