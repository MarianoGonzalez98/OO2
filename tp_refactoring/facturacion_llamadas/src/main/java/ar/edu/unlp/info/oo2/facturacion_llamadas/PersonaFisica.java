package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersonaFisica extends Persoona{
	private String dni;
	public PersonaFisica(String dni,String nombreApellido) {
		super(nombreApellido, 0.0);
		this.dni=dni;
	}
	public String getDni() {
		return dni;
	}
}
