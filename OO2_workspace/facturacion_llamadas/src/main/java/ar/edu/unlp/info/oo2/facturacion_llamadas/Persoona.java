package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Persoona {
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private String nombreApellido;
	private String telefono;
	private Persoonal sistema;
	private double porcentajeDescuento;
	
	public Persoona(String nombreApellido, double porcentajeDescuento) {
		this.nombreApellido = nombreApellido;
		this.porcentajeDescuento = porcentajeDescuento;
	}
	public boolean tieneTelefono(Persoona p) {
		return this.getTelefono().equals(p.getTelefono());
	}
	public List<Llamada> getLlamadas() {
		return llamadas;
	}
	public String getNombreApellido() {
		return nombreApellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Persoonal getSistema() {
		return sistema;
	}
	public void setSistema(Persoonal sistema) {
		this.sistema = sistema;
	}
	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}
}
