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
	
	//falta documentar estos cambios
	public double calcularMontoLlamadas() {
		return llamadas.stream().mapToDouble( llamada -> calcularMontoLlamada(llamada)).reduce(0,Double::sum);
		
	}
	
	public double calcularMontoLlamadasRefactor() {
		double costoTotal = 0;
		for (Llamada llamada : llamadas) {
			costoTotal+=calcularMontoLlamada(llamada);
		}
		return costoTotal;
		
	}
	
	public double calcularMontoLlamada(Llamada llamada) {
		double descuentoLlamada = llamada.calcularCosto() * getPorcentajeDescuento();
		return llamada.calcularCosto() - descuentoLlamada;
	}
	public double calcularMontoLlamadasViejo() {

		double costoTotal = 0;
		for (Llamada llamada : llamadas) {
				double descuentoLlamada = llamada.calcularCosto() * getPorcentajeDescuento();
				costoTotal += llamada.calcularCosto() - descuentoLlamada;
		}
		return costoTotal;
		
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
