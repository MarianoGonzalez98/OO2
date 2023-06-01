package personajes;

import armaduras.ArmaduraDeAcero;
import armas.Espada;

public class Guerrero extends Personaje{
	public Guerrero(String nombre){
		super(nombre, new ArmaduraDeAcero(), new Espada());
	}
}
