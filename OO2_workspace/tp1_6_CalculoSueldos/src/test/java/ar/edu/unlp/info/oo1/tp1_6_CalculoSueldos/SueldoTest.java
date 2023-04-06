package ar.edu.unlp.info.oo1.tp1_6_CalculoSueldos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SueldoTest {
	Empleado tem;
	Empleado pas;
	Empleado plan;
	
	@BeforeEach
	void setUp() throws Exception {
		tem = new Temporario (true,4,2);
		pas = new Pasante (5);
		plan = new Planta (false,10,2);
	}
	
	@Test
	void testSueldo() {
		assertEquals(30272,tem.sueldo());
		assertEquals(26900,pas.sueldo());
		assertEquals(66300,plan.sueldo());
	}
}


