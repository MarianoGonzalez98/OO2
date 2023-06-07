package builder;

public class Director {
	private MuebleBuilder builder;
		
	public void armarMueble() {
		builder.reset();
		builder.buldPuerta();
		builder.buildCajones();
	}
	
	public void setBuilder(MuebleBuilder builder) {
		this.builder = builder;
	}
}
