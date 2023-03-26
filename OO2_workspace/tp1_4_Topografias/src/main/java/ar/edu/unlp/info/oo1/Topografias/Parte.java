package ar.edu.unlp.info.oo1.Topografias;

import java.util.ArrayList;
import java.util.List;

public abstract class Parte implements Topografia{
	private double proporcionAgua;
	
	public Parte(double proporcionAgua) {
		this.proporcionAgua = proporcionAgua;
	}
	
	public double getProporcionAgua() {
		return proporcionAgua;
	}
	
	public double getProporcionTierra() {
		return 1.0-proporcionAgua;
	}
	
	public List<Topografia> getTopografias(){
		List<Topografia> lista = new ArrayList<Topografia>();
		for (int i = 0; i < 4; i++) {
			lista.add(this);
		}
		return lista;
	}
	
	
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		Topografia top = (Topografia)obj;
		
		return this.getProporcionAgua() == top.getProporcionAgua();
	}
}
