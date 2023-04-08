package ar.edu.unlp.info.oo1.tp1_9_Encriptador;

public class ConexionSegura extends Conexion{
	private Encriptador encriptador;

	public ConexionSegura(Encriptador encriptador) {
		setEncriptador(encriptador);
	}
	
	public String enviar(String mensaje) {
		return encriptador.encriptar(mensaje);
	}
	
	public void setEncriptador(Encriptador encriptador) {
		this.encriptador=encriptador;
	}
}
