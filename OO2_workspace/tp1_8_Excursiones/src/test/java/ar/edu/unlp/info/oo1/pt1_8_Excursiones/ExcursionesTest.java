package ar.edu.unlp.info.oo1.pt1_8_Excursiones;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExcursionesTest {
	Excursion excursion1;
	Usuario marian,juli;
	
	@BeforeEach
	void setUp() throws Exception {
		excursion1 = new Excursion("VisitaCataratas",LocalDate.of(2022, 1, 21),
				LocalDate.of(2023, 2,22 ),"Las cataratas",20,1,3);
		marian = new Usuario("mariano","gonzalez", "mga@gm");
		juli = new Usuario("julia","rojas", "julia@gm");
	}
		

	@Test
	void test() {
		excursion1.inscribir(juli);
		excursion1.inscribir(marian);
		System.out.println(excursion1.obtenerInformacion());
	}

}
