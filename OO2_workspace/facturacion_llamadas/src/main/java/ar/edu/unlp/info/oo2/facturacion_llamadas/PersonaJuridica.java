package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersonaJuridica extends Persoona{
	private String cuit;
	public PersonaJuridica(String cuit,String nombreApellido) {
		super(nombreApellido,0.15);
		this.cuit=cuit;
	}
	public String getCuit() {
		return cuit;
	}
}
