package builder;

public class Cliente {
	Director director = new Director();
	
	public Mueble hacerMuebleMadera() {
		MuebleBuilder muebleMaderaBuilder = new MuebleMaderaBuilder();
		director.setBuilder(muebleMaderaBuilder);
		director.armarMueble();
		return muebleMaderaBuilder.getResult();
	}
}
