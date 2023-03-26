package ar.edu.unlp.info.oo1.Topografias;

import java.util.List;

public interface Topografia {
	public double getProporcionAgua();
	public double getProporcionTierra();
	public List<Topografia> getTopografias();
}
