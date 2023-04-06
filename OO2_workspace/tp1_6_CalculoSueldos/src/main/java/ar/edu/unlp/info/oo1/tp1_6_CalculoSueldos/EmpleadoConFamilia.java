package ar.edu.unlp.info.oo1.tp1_6_CalculoSueldos;

public abstract class EmpleadoConFamilia extends Empleado{
	private boolean casado;
	private int cantHijos;
	
	public EmpleadoConFamilia(boolean casado, int cantHijos) {
		this.cantHijos = cantHijos;
		this.casado = casado;
	}

	protected double sueldoAdicional() {
		double suma = 0;
		if (casado) {
			suma+=5000;
		}
		suma += 2000*cantHijos;
		return suma;
	}

	
	
	public boolean iscasado() {
		return casado;
	}

	public void setcasado(boolean casado) {
		this.casado = casado;
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}
	
	
}
