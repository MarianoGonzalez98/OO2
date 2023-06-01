package personajes;

import armaduras.ArmaduraDeCuero;
import armas.Baston;

public class Mago extends Personaje{

	public Mago(String nombre){
		super(nombre, new ArmaduraDeCuero(), new Baston());
	}
	
}
