package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Persoonal {
	List<Persoona> usuarios = new ArrayList<Persoona>();
	List<Llamada> llamadas = new ArrayList<Llamada>();
	private SortedSet<String> guiaTelefonos = new TreeSet<String>();


	
	static double descuentoJur = 0.15;
	static double descuentoFis = 0;
	
	public void agregarTelefono(String str) {
		boolean encontre = this.getGuia().contains(str);
		if (!encontre) {
			this.getGuia().add(str);
		}
		else {
			encontre= false;
		}
	}
	
	public Persoona registrarUsuario(String identificacion, String nombre, String tipo) {
		Persoona usuario = new Persoona();
		usuario.setNombreApellido(nombre);
		usuario.setTipo(tipo);
		String telefono = this.getGuia().last();
		usuario.setTelefono(telefono);
		this.getGuia().remove(telefono);
		if (tipo.equals("fisica")) {
			usuario.setDni(identificacion);
		}
		else if (tipo.equals("juridica")) {
			usuario.setCuit(identificacion);
		}
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
	
	public Llamada registrarLlamada(Persoona q, Persoona q2, String t, int d) {
		Llamada x = new Llamada();
		x.tipoDeLlamada = t;
		x.setEmisor(q.getTelefono());
		x.setRemitente(q2.getTelefono());
		x.setDuracion(d);
		llamadas.add(x);
		q.getLlamadas().add(x);
		return x;
		
	}
	
	public double calcularMontoTotalLlamadas(Persoona p) {
		double c = 0;
		Persoona aux = null;
		for (Persoona pp : usuarios) {
			if (pp.getTelefono() == p.getTelefono()) {
				aux = pp;
				break;
			}
		} if (aux == null) return c;
		if (aux != null) {
			for (Llamada l : aux.getLlamadas()) {
				double auxc = 0;
				if (l.tipoDeLlamada == "nacional") {
					auxc += l.getDuracion() *3 + (l.getDuracion()*3*0.21);
				} else if (l.tipoDeLlamada == "internacional") {
					auxc += l.getDuracion() *200 + (l.getDuracion()*200*0.21);
				}
				
				if (aux.getTipo() == "fisica") {
					auxc -= auxc*descuentoFis;
				} else if(aux.getTipo() == "juridica") {
					auxc -= auxc*descuentoJur;
				}
				c += auxc;
			}
		}
		return c;
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
