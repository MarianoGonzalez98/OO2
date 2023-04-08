package ar.edu.unlp.info.oo1.pt1_8_Excursiones;

public class Llena extends Estado{

	@Override
	public void inscribir(Usuario u, Excursion exc) {
		exc.agregarAListaEspera(u);
	}

	@Override
	public String obtenerInfo(Excursion exc) {
		return exc.infoBasica();
	}

}
