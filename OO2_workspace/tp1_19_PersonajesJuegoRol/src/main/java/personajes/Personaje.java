package personajes;

import armaduras.Armadura;
import armas.Arma;

public class Personaje {
	private String nombre;
	private int vida;
	private Armadura armadura;
	private Arma arma;
	
	public Personaje(String nombre,Armadura armadura, Arma arma) {
		this.nombre=nombre;
		this.armadura=armadura;
		this.arma=arma;
		this.vida=100;
	}
	
	public boolean tieneVida() {
		return vida > 0;
	}
		
	public void combatirCon(Personaje oponente) {
		oponente.recibirAtaque(arma);
	}
	
	private void recibirAtaque(Arma arma) {
		vida -= arma.daniarArmadura(armadura);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int vidaActual() {
		return vida;
	}
	
}
