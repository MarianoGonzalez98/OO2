package juego;
import personajes.Personaje;

public class Juego {
	
	public boolean enfrentarPersonajes(Personaje personaje1, Personaje personaje2) {
		if (!personaje1.tieneVida() || !personaje2.tieneVida()) {
			return false; //si devuelve falso, es que no se pueden enfrentar
		}
		personaje1.combatirCon(personaje2);
		personaje2.combatirCon(personaje1);
		return true;
	}
	

	
}
