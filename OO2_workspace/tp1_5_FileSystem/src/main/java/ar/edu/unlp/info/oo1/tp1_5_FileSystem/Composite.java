package ar.edu.unlp.info.oo1.tp1_5_FileSystem;

import java.time.LocalDate;

public abstract class Composite {
	private String nombre;
	private LocalDate fecha;
	private int tamano;
	
	public Composite(String nombre, LocalDate fecha, int tamano) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.tamano = tamano;
	}
	
	public abstract int tamanoTotalOcupado();
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
	//public abstract int tamanioArchivoMasGrande();
	
	public abstract boolean esArchivo();

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public int getTamano() {
		return tamano;
	}

	
}
