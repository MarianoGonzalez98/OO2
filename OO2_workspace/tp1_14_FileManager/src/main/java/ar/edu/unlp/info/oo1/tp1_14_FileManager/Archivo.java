package ar.edu.unlp.info.oo1.tp1_14_FileManager;

public class Archivo implements ArchivoComponent{

	private String nombre;
	private String extension;
	
	public Archivo(String nombre,String extension){
		this.nombre=nombre;
		this.extension=extension;
	}
	public String prettyPrint() {
		return "";
	}


	@Override
	public String getNombre() {
		return nombre;
	}


	@Override
	public String getExtension() {
		return extension;
	}

}
