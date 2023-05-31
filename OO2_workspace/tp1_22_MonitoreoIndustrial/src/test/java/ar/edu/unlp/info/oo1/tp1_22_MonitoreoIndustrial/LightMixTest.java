package ar.edu.unlp.info.oo1.tp1_22_MonitoreoIndustrial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LightMixTest {
	MixingTank workingTank,failedTank;
	
	ProcessStep lightMix;
	@BeforeEach
	void setUp() throws Exception {
		lightMix = new LightMix();
		workingTank = new MixingTankStub(true);
		failedTank = new MixingTankStub(false);
	}

	@Test
	void executeTest() {
		lightMix.execute(workingTank);
		assertTrue(lightMix.isDone());
		lightMix.execute(failedTank);
		assertFalse(lightMix.isDone());
	}

}
