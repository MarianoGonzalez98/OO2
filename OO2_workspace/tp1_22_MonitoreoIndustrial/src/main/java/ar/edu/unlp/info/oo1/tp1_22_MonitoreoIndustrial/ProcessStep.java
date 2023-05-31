package ar.edu.unlp.info.oo1.tp1_22_MonitoreoIndustrial;

public abstract class ProcessStep {
	private boolean result;
	
	public void execute (MixingTank tank) {
		if (this.basicExecute(tank)) {
			this.setSucces();
		}
		else this.setFailure();
	}
	
	public boolean isDone() {
		return result;
	}
	
	private void setSucces() {
		result = true;
	}
	
	private void setFailure() {
		result = false;
	}
	

	protected abstract boolean basicExecute (MixingTank tank);
	
}
