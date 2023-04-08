package ar.edu.unlp.info.oo1.pt1_8_Excursiones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Excursion {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMin;
	private int cupoMax;
	
	private List<Usuario> inscriptos;
	private List<Usuario> listaEspera;
	
	private Estado estado;
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, double costo,int cupoMin, int cupoMax) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		
		inscriptos = new ArrayList<>();
		listaEspera = new ArrayList<>();
		estado = new NoAlcanzaMinimo();
	}
	
	
	public void inscribir (Usuario unUsuario) {
		estado.inscribir(unUsuario, this);
	}
	
	public String obtenerInformacion() {
		return estado.obtenerInfo(this);
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void agregarInscripto(Usuario u) {
		this.inscriptos.add(u);
	}
	
	public void agregarAListaEspera(Usuario u) {
		this.listaEspera.add(u);
	}
	
	public boolean alcanzoCupoMin() {
		return inscriptos.size() >= cupoMin;
	}
	
	public boolean alcanzoCupoMax() {
		return inscriptos.size() >= cupoMax;
	}
	
	public String infoBasica() {
		return "Nombre:"+ this.nombre 
				+".\n Costo:"+this.costo
				+".\n Fecha Inicio:"+this.fechaInicio
				+".\n Fecha Fin:"+this.fechaFin
				+".\n Punto de encuentro:"+this.puntoEncuentro;
	}
	
	public String mailsUsuariosInscriptos() {
		String mails="\n Mails:";
		
		mails += inscriptos.stream().map(u -> u.getMail()).collect(Collectors.joining(" "));
		return mails;
	}
	
	public int cantUsuariosFaltantesMin() {
		return this.cupoMin - this.inscriptos.size();
	}
	
	public int cantUsuariosFaltantesMax() {
		return this.cupoMax - this.inscriptos.size();
	}
}
