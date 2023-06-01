package creators;

import personajes.Mago;
import personajes.Personaje;

public class MagoCreator extends PersonajeCreator{

	public Personaje createPersonaje(String nombre) {
		return new Mago(nombre);
	}
	
	/*
	public Personaje createPersonaje(String nombre) {
		return new Personaje(nombre,new ArmaduraDeCuero(),new Baston());
	}
	
	*/
}
