package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersonaJuridica extends Persoona{
	private String cuit;
	public PersonaJuridica(String cuit,String nombreApellido) {
		super(nombreApellido);
		this.cuit=cuit;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getTipo() {
		return "juridica";
	}
}
