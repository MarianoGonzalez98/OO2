package ar.edu.unlp.info.oo1.Topografias;



public abstract class Topografia {
	public abstract double getProporcionAgua();
	public abstract double getProporcionTierra();
	
	public boolean igualTierra() {
		return false;
	}
	public boolean igualAgua() {
		return false;
	}
	public boolean igualMixta(Mixta topoMixta) {
		return false;
	}
	
	public abstract boolean igual(Topografia top);
	
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		if (!(obj instanceof Topografia)) {
			return false;
		}
		Topografia top = (Topografia)obj;
		return this.igual(top);
	}
}
