package builder;

public class MuebleMaderaBuilder implements MuebleBuilder{

	private Mueble mueble = new Mueble();
	public void reset() {
		mueble = new Mueble();
	}

	public void buldPuerta() {
		mueble.setPuerta("Puerta de madera");
	}

	@Override
	public void buildCajones() {
		mueble.setCajones("Cajones de madera");		
	}

	public Mueble getResult() {
		return mueble;
	}
	
}
