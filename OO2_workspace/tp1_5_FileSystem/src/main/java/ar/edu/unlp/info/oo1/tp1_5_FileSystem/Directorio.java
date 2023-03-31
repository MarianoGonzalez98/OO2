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
	
	public boolean esArchivo() {
		return false;
	}
	
	public int tamanoTotalOcupado() {
		int tamanioContenido = contenido.stream()
				.mapToInt(e -> e.tamanoTotalOcupado())
				.sum();
		return tamanioContenido + this.getTamano();
	}
	
	
	public Archivo archivoMasGrande() {
		Archivo resultado = contenido.stream()
			.map(e -> e.archivoMasGrande())
			.filter(e -> e != null) //esto filtra los directorios vacios
			.max((e1,e2) -> Integer.compare(
					e1.getTamano(), e2.getTamano()))
			.orElse(null);
		
		return resultado;
		
	}

	@Override
	public Archivo archivoMasNuevo() {
		// TODO Auto-generated method stub
		return null;
	}



	
	

}
