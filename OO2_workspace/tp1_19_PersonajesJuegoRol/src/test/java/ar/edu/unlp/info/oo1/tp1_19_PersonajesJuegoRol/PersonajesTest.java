package ar.edu.unlp.info.oo1.tp1_19_PersonajesJuegoRol;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import creators.ArqueroCreator;
import creators.GuerreroCreator;
import creators.MagoCreator;
import creators.PersonajeCreator;
import juego.Juego;
import personajes.Personaje;

class PersonajesTest {
	Juego juego;
	Personaje mago,arquero,guerrero;
	
	PersonajeCreator magoCreator,arqueroCreator,guerreroCreator;
	
	
	@BeforeEach
	void setUp() throws Exception {
		juego = new Juego();
		
		magoCreator = new MagoCreator();
		arqueroCreator = new ArqueroCreator();
		guerreroCreator = new GuerreroCreator();
		
		mago = magoCreator.createPersonaje("magoJulio");
		guerrero = guerreroCreator.createPersonaje("guerreroMarcos");
	}

	@Test
	void combateTest() {
		assertTrue(juego.enfrentarPersonajes(mago, guerrero)); 
		assertEquals(92, mago.vidaActual());
		assertEquals(99, guerrero.vidaActual());
	}
	
	@Test
	void noSePuedeCombarirTest() {
		for (int i = 0; i < 13; i++) { //pueden realizar 13 combates
			assertTrue(juego.enfrentarPersonajes(guerrero, mago));
		}
		
		assertFalse(juego.enfrentarPersonajes(guerrero, mago));
		
		
	}

}
