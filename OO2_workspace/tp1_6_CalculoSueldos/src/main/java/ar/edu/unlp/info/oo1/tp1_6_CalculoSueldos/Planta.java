package ar.edu.unlp.info.oo1.tp1_6_CalculoSueldos;

public class Planta extends EmpleadoConFamilia{
	private int antiguedad;
	
	public Planta(boolean casado, int hijos, int antiguedad) {
		super(casado,hijos);
		this.antiguedad = antiguedad;
	}
	
	protected double sueldoBasico() {
		return super.sueldoBasico() + 30000;
	}

	protected double sueldoAdicional() {
		return super.sueldoAdicional() + antiguedad*2000;
	}
}
