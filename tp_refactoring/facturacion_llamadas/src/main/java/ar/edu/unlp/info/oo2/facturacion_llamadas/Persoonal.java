package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Persoonal {
	
	private List<Persoona> usuarios = new ArrayList<Persoona>();
	private SortedSet<String> guiaTelefonos = new TreeSet<String>();
	
	public List<Persoona> getUsuarios() {
		return this.usuarios;
	}
	
	public boolean agregarTelefono(String telefono) {
		return guiaTelefonos.add(telefono);
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
	
	public boolean eliminarUsuario(Persoona usuario) {
		this.guiaTelefonos.add(usuario.getTelefono());
		return usuarios.remove(usuario);
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
