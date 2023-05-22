package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersonaFisica extends Persoona{
	private String dni;
	public PersonaFisica(String dni,String nombreApellido) {
		super(nombreApellido);
		this.dni=dni;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getDescuentoLlamada() {
		return 0.0;
	}
}
