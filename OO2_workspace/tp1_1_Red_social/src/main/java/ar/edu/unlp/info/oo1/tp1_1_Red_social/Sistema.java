package ar.edu.unlp.info.oo1.tp1_1_Red_social;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	//mejorar crearUsuario() 
	private List<Usuario> usuarios;
	
	public Sistema() {
		usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario crearUsuario( String nombreUsuario) {
		//mejorar!!
		if (usuarios.contains(nombreUsuario)) {
			return null;
		}
		Usuario usuario = new Usuario(nombreUsuario);
		usuarios.add(usuario);
		return usuario;
	}
}
