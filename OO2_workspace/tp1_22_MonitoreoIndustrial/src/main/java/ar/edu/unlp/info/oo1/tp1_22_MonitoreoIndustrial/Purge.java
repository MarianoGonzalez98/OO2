package ar.edu.unlp.info.oo1.tp1_22_MonitoreoIndustrial;

public class Purge extends ProcessStep{


	protected boolean basicExecute(MixingTank tank) {
		return (tank.heatPower(20) 
				&& tank.mixerPower(5));
	}
	
}
