package ar.edu.unlp.info.oo1.tp1_9_Encriptador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptadorTest {
	Mensajero m;
	String mensaje;
	@BeforeEach
	void setUp() throws Exception {
		m = new Mensajero(new ConexionSegura(new EncriptadorBlowfish()));
		mensaje = "Soy un mensaje";
	}

	@Test
	void test() {
		assertEquals("Encriptado por Blowfish: "+mensaje, m.enviar(mensaje));
	}

}
