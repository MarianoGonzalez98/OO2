package ar.edu.unlp.info.oo2.facturacion_llamadas.copy1;

import java.util.ArrayList;
import java.util.List;

public class Persoona {
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private String tipo;
	private String nombreApellido;
	private String telefono;
	private String cuit;
	private String dni;
	private Persoonal sistema;
	
	public List<Llamada> getLlamadas() {
		return llamadas;
	}
	public void setLlamadas(List<Llamada> llamadas) {
		this.llamadas = llamadas;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombreApellido() {
		return nombreApellido;
	}
	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Persoonal getSistema() {
		return sistema;
	}
	public void setSistema(Persoonal sistema) {
		this.sistema = sistema;
	}
	

	

	
}
