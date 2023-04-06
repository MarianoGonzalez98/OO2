package ar.edu.unlp.info.oo1.tp1_6_CalculoSueldos;

public class Temporario extends EmpleadoConFamilia{
	private int horasTrabajadas;
	
	public Temporario(boolean casado, int cantHijos,int horasTrabajadas) {
		super(casado,cantHijos);
		this.horasTrabajadas = horasTrabajadas;
	}
	
	protected double sueldoBasico() {
		return super.sueldoBasico() + horasTrabajadas * 300;
	}

}
