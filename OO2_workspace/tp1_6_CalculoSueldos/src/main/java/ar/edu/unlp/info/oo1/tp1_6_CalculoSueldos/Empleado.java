package ar.edu.unlp.info.oo1.tp1_6_CalculoSueldos;

public abstract class Empleado {
	
	public double sueldo() {
		return this.sueldoBasico() + this.sueldoAdicional() - this.descuento();
	}
	
	protected double sueldoBasico() {
		return 20000;
	}
	protected abstract double sueldoAdicional();
	
	protected double descuento() {
		return 0.13 * this.sueldoBasico() + 0.05 * this.sueldoAdicional();
	}
}
