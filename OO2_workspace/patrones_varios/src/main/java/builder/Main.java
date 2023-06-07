package builder;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Mueble mueble = cliente.hacerMuebleMadera();
		
		System.out.println(mueble.getPuerta());

	}

}
