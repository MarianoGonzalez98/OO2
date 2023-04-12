package ar.edu.unlp.info.oo1.tp1_14_FileManager;

public class ConcatenaExtension extends DecoratorVisualizacion{

	public ConcatenaExtension(ArchivoComponent component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + super.getExtension() + " - ";
	}

}
