package ar.edu.unlp.info.oo1.Topografias;


public class SoloTierra extends Parte{

	public SoloTierra() {
		super(0);
	}
	
	public boolean igualTierra() {
		return true;
	}
	
	public boolean igual(Topografia top) {

		return top.igualTierra();
	}
}

