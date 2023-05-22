package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Persoonal {
	List<Persoona> usuarios = new ArrayList<Persoona>();
	private SortedSet<String> guiaTelefonos = new TreeSet<String>();
	
	public void agregarTelefono(String str) {
		boolean encontre = this.getGuia().contains(str);
		if (!encontre) {
			this.getGuia().add(str);
		}
		else {
			encontre= false;
		}
	}
	
	public Persoona registrarUsuario(Persoona usuario) {
		String telefono = this.getGuia().last();
		usuario.setTelefono(telefono);
		this.getGuia().remove(telefono);
		usuario.setSistema(this); 
		usuarios.add(usuario);
		return usuario;
	}
	
	public boolean eliminarUsuario(Persoona p) {
		List<Persoona> l = p.getSistema().usuarios.stream().filter(persona -> persona != p).collect(Collectors.toList());
		boolean borre = false;
		if (l.size() < usuarios.size()) {
			this.usuarios = l;
			this.getGuia().add(p.getTelefono());
			borre = true;
		}
		return borre;
		
	}
	
	public Llamada registrarLlamada(Persoona emisor, Llamada llamada) {
		emisor.getLlamadas().add(llamada);
		return llamada;
		
	}
	
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
