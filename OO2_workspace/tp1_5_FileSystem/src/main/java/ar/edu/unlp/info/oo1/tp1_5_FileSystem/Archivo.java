package ar.edu.unlp.info.oo1.tp1_5_FileSystem;

import java.time.LocalDate;

public class Archivo extends Composite	{
	
	
	public Archivo (String nombre, LocalDate fecha, int tamano) {
		super(nombre,fecha,tamano);
	}

	public int tamanoTotalOcupado() {
		return this.getTamano();
	}

	public int tamanioArchivoMasGrande() {
		return this.getTamano();
	}
	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}
	
	public int tieneFechaPosteriorA(Archivo arc) {
		return this.getFecha().compareTo(arc.getFecha());
	}
	
	

}
