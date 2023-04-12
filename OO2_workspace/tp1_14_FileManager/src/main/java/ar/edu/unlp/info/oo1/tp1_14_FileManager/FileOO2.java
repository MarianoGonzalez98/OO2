package ar.edu.unlp.info.oo1.tp1_14_FileManager;

import java.util.ArrayList;
import java.util.List;

public class FileOO2 {
	private List<ArchivoComponent> archivos;
	
	public FileOO2() {
		archivos = new ArrayList<>();
	}
	
	public void agregarArchivo(ArchivoComponent archivo) {
		archivos.add(archivo);
	}
	
	public String printArchivos() {
		StringBuilder texto = new StringBuilder(); //stringbuilder es correcto??
		archivos.forEach( a -> texto.append(a.prettyPrint()));
		return texto.toString();
	}
}
