package ar.edu.unlp.info.oo2.facturacion_llamadas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersoonalTest {
	
	Persoonal sistema;
	Persoona emisorPersonaFisca, remitentePersonaFisica, emisorPersonaJuridica, remitentePersonaJuridica;
	
	@BeforeEach
	public void setUp() {
		this.sistema = new Persoonal();
		this.sistema.agregarTelefono("2214444554");
		this.sistema.agregarTelefono("2214444555");
		this.sistema.agregarTelefono("2214444556");
		this.sistema.agregarTelefono("2214444557");
		

		this.emisorPersonaFisca = sistema.registrarUsuario(new PersonaFisica("11555666", "Marcelo Tinelli"));
		this.remitentePersonaFisica = sistema.registrarUsuario(new PersonaFisica("00000001", "Mirtha Legrand"));
		this.emisorPersonaJuridica = sistema.registrarUsuario(new PersonaJuridica("17555222", "Felfort"));
		this.remitentePersonaJuridica = sistema.registrarUsuario(new PersonaJuridica("25765432", "Moovistar"));
		
		this.emisorPersonaJuridica.agregarLlamada(new LlamadaNacional(emisorPersonaJuridica, remitentePersonaFisica, 10));
		this.emisorPersonaJuridica.agregarLlamada(new LlamadaInternacional(emisorPersonaJuridica, remitentePersonaFisica, 8));
		this.emisorPersonaJuridica.agregarLlamada(new LlamadaNacional(emisorPersonaJuridica, remitentePersonaJuridica, 5));
		this.emisorPersonaJuridica.agregarLlamada(new LlamadaInternacional(emisorPersonaJuridica, remitentePersonaJuridica, 7));
		this.emisorPersonaFisca.agregarLlamada(new LlamadaNacional(emisorPersonaFisca, remitentePersonaFisica, 15));
		this.emisorPersonaFisca.agregarLlamada(new LlamadaInternacional(emisorPersonaFisca, remitentePersonaFisica, 45));
		this.emisorPersonaFisca.agregarLlamada(new LlamadaNacional(emisorPersonaFisca, remitentePersonaJuridica, 13));
		this.emisorPersonaFisca.agregarLlamada(new LlamadaInternacional(emisorPersonaFisca, remitentePersonaJuridica, 17));
		
	}

	@Test
	void testcalcularMontoTotalLlamadas() {
		assertEquals(this.emisorPersonaFisca.calcularMontoLlamadas(), 15105.640000000001);
		assertEquals(this.emisorPersonaJuridica.calcularMontoLlamadas(), 3131.7825000000003);
		assertEquals(remitentePersonaFisica.calcularMontoLlamadas(), 0);
		assertEquals(this.remitentePersonaJuridica.calcularMontoLlamadas(), 0);
	}
	
	@Test
	void testAgregarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 4);
		this.sistema.agregarTelefono("2214444558"); 
		Persoona nuevaPersona = this.sistema.registrarUsuario(new PersonaFisica("2444555","Chiche Gelblung"));
		
		assertEquals(this.sistema.cantidadDeUsuarios(), 5);
		assertTrue(this.sistema.existeUsuario(nuevaPersona));
		
	}
	
	@Test
	void testEliminarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 4);
		assertTrue(this.sistema.existeUsuario(emisorPersonaFisca));
		this.sistema.eliminarUsuario(emisorPersonaFisca);
		assertEquals(this.sistema.cantidadDeUsuarios(), 3);
		assertFalse(this.sistema.existeUsuario(emisorPersonaFisca));
	}

}
