package ar.edu.unlp.info.oo1.Topografias;

public class SoloAgua extends Parte{
	
	public SoloAgua() {
		super(1);
	}
	
	public boolean igualAgua() {
		return true;
	}
	
	public boolean igual(Topografia top) {

		return top.igualAgua();
	}
}
