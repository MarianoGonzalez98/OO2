package ar.edu.unlp.info.oo1.pt1_8_Excursiones;

public class NoAlcanzaMinimo extends Estado{

	@Override
	public void inscribir(Usuario u, Excursion exc) {
		exc.agregarInscripto(u);
		if (exc.alcanzoCupoMin()) {
			exc.setEstado(new AlcanzaMinimo());
		}
		
	}

	@Override
	public String obtenerInfo(Excursion exc) {
		return exc.infoBasica()
				+ ".\n Cantidad de ususarioq que faltan para alcanzar cupo minimo:"
				+ exc.cantUsuariosFaltantesMin();
	}
	
}
