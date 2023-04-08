package ar.edu.unlp.info.oo1.pt1_8_Excursiones;

public abstract class Estado {
	public abstract void inscribir(Usuario u, Excursion exc);
	public abstract String obtenerInfo(Excursion exc);
}
