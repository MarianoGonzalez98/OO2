package ar.edu.unlp.info.oo1.Topografias;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mixta extends Topografia{
	private List<Topografia> partes;
	
	public Mixta(Topografia parte1,Topografia parte2,Topografia parte3,Topografia parte4) {
		partes = new ArrayList<>();
		partes.add(parte1);
		partes.add(parte2);
		partes.add(parte3);
		partes.add(parte4);
	}
	
	public double getProporcionAgua() {
		double sumaAgua = partes.stream().mapToDouble(p -> p.getProporcionAgua()).sum();
		return sumaAgua/4.0;
	}
	
	public double getProporcionTierra() {
		double sumaTierra = partes.stream().mapToDouble(p -> p.getProporcionTierra()).sum();
		return sumaTierra/4.0;
	}
	
	public List<Topografia> getTopografias() {
		return partes;
	}
	
	@Override
	public boolean igualMixta(Mixta topoMixta) {
		return Objects.equals(partes, topoMixta.getTopografias());
	}
	
	
	public boolean igual(Topografia top) {

		//si no tienen la misma proporcion 
		if (this.getProporcionAgua()!= top.getProporcionAgua()) {
			return false;
		}
		
		return top.igualMixta(this);

	}



	
	
}
