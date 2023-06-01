package creators;

import personajes.Arquero;
import personajes.Personaje;

public class ArqueroCreator extends PersonajeCreator{

	public Personaje createPersonaje(String nombre) {
		return new Arquero(nombre);
	}
}
