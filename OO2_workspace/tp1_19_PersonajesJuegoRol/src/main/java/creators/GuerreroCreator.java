package creators;

import personajes.Guerrero;
import personajes.Personaje;

public class GuerreroCreator extends PersonajeCreator{

	public Personaje createPersonaje(String nombre) {
		return new Guerrero(nombre);
	}

}
