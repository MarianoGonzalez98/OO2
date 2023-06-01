package personajes;

import armaduras.ArmaduraDeCuero;
import armas.Arco;

public class Arquero extends Personaje{
	public Arquero(String nombre){
		super(nombre, new ArmaduraDeCuero(), new Arco());
	}
}
