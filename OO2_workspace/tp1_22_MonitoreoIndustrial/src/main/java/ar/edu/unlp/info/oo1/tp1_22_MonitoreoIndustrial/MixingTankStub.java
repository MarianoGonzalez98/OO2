package ar.edu.unlp.info.oo1.tp1_22_MonitoreoIndustrial;

public class MixingTankStub extends MixingTank{
	private boolean worksWell; 
	
	
	public MixingTankStub(boolean worksWell) {
		this.worksWell=worksWell;
	}
	@Override
	public boolean heatPower(int percentage) {
		return worksWell;
	}

	@Override
	public boolean mixerPower(int percentage) {
		// TODO Auto-generated method stub
		return worksWell;
	}

	@Override
	public boolean purge() {
		// TODO Auto-generated method stub
		return worksWell;
	}

	@Override
	public double upTo() {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public double temperature() {
		// TODO Auto-generated method stub
		return -1;
	}

}
