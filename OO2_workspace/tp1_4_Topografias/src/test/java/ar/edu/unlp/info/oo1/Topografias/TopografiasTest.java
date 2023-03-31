package ar.edu.unlp.info.oo1.Topografias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TopografiasTest {
	Topografia mar,mar1,mar2,mar3,mar4;
	Topografia desierto,desierto1,desierto2,desierto3,desierto4;
	Topografia mixta,mixta1,mixta2,mixta3,mixta4;
	Topografia superMixta;
	
	@BeforeEach
	void setUp() throws Exception {
		mar = new SoloAgua();
		desierto = new SoloTierra();
		
		mar1 = new SoloAgua();
		desierto1 = new SoloTierra();
		
		mar2 = new SoloAgua();
		desierto2 = new SoloTierra();
		
		mar3 = new SoloAgua();
		desierto3 = new SoloTierra();
		
		mar4 = new SoloAgua();
		desierto4 = new SoloTierra();
		
		mixta = new Mixta(mar, mar1, mar2, desierto);
		
		mixta1= new Mixta(mar,desierto,desierto,desierto);
		
		mixta2= new Mixta(mar1,desierto2,desierto3,desierto4);
		
		superMixta = new Mixta(mixta,desierto1,desierto2,desierto3);
	}

	@Test
	void test() {
		assertFalse(mar.equals(mixta));
		assertFalse(mixta.equals(mar));
		
		assertFalse(mixta.equals(mixta1));
		assertTrue(mixta1.equals(mixta2));
		
		assertFalse(superMixta.equals(mixta1));
		
		
	}

}
