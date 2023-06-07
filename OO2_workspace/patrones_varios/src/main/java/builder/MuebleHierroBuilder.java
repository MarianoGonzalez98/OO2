package builder;

public class MuebleHierroBuilder implements MuebleBuilder{
	private Mueble mueble = new Mueble();
	public void reset() {
		mueble = new Mueble();
	}

	public void buldPuerta() {
		mueble.setPuerta("Pueta de Hierro");
	}


	public void buildCajones() {
		mueble.setCajones("Cajones de hierro");		
	}

	public Mueble getResult() {
		return mueble;
	}
}
