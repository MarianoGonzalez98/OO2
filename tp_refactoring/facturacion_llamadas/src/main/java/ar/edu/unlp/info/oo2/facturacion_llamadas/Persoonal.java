package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Persoonal {
	List<Persoona> usuarios = new ArrayList<Persoona>();
	private SortedSet<String> guiaTelefonos = new TreeSet<String>();
	
	//change signature
	public boolean agregarTelefono(String str) {
		return guiaTelefonos.add(str);
	}
	
	public void asignarTelefono(Persoona usuario) {
		String telefono = this.getGuia().last();
		usuario.setTelefono(telefono);
		this.getGuia().remove(telefono);
	}
	
	public Persoona registrarUsuario(Persoona usuario) {
		asignarTelefono(usuario);
		usuarios.add(usuario);
		return usuario;
	}
	
	//change signature
	public boolean eliminarUsuario(Persoona p) {
		this.guiaTelefonos.add(p.getTelefono());
		return usuarios.remove(p);
	}
	
	//middleman
	public Llamada registrarLlamada(Persoona emisor, Llamada llamada) {
		return emisor.agregarLlamada(llamada);
	}
	
	//middleman
	public double calcularMontoTotalLlamadas(Persoona persona) {
		return persona.calcularMontoLlamadas();
	}

	public int cantidadDeUsuarios() {
		return usuarios.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return usuarios.contains(persona);
	}
	
	public SortedSet<String> getGuia() {
		return guiaTelefonos;
	}

	public void setGuia(SortedSet<String> guia) {
		this.guiaTelefonos = guia;
	}
}
