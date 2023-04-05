package ar.edu.unlp.info.oo1.tp1_5_FileSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends Composite{
	
	private List<Composite> contenido;
	
	
	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha, 32);
		contenido = new ArrayList<>();
	}

	public List<Composite> getContenido() {
		return contenido;
	}
	
	public void agregar(Composite elemento) {
		contenido.add(elemento);
	}
	
	
	public int tamanoTotalOcupado() {
		int tamanioContenido = contenido.stream()
				.mapToInt(e -> e.tamanoTotalOcupado())
				.sum();
		return tamanioContenido + this.getTamano();
	}
	
	
	public Archivo archivoMasGrande() {
		return contenido.stream()
				.map(a -> a.archivoMasGrande())
				.filter(e -> e != null) //esto filtra los directorios vacios
				.max((a1,a2)-> Integer.compare(a1.getTamano(), a2.getTamano()))
				.orElse(null);
	}
		


	public Archivo archivoMasNuevo() {
		Archivo resultado = contenido.stream()
			.map(e -> e.archivoMasNuevo())
			.filter(e -> e != null) //esto filtra los directorios vacios
			.max((e1,e2) -> e1.tieneFechaPosteriorA(e2))
			.orElse(null);
		
		return resultado;
		
	}

	
	

}
