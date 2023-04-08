package ar.edu.unlp.info.oo1.tp1_9_Encriptador;

public class Mensajero {
	private Conexion conexion;
	
	public Mensajero(Conexion conex) {
		this.conexion = conex;
	}
	public String enviar(String mensaje) {
		return conexion.enviar(mensaje);
	}
}
