package ar.edu.unlp.info.oo1.tp1_22_MonitoreoIndustrial;

public class LightMix extends ProcessStep{

	protected boolean basicExecute(MixingTank tank) {
		return tank.heatPower(0) &&
				tank.mixerPower(0) &&
				tank.purge();
	}
	
}
