package ar.edu.unlp.info.oo1.tp1_14_FileManager;

public abstract class DecoratorVisualizacion implements ArchivoComponent{

	private ArchivoComponent component;
	
	public DecoratorVisualizacion(ArchivoComponent component) {
		this.component = component;
	}
	
	public String prettyPrint() {
		return component.prettyPrint();
	}
	

	public String getNombre() {
		return component.getNombre();
	}


	@Override
	public String getExtension() {
		return component.getExtension();
	}
	
}
