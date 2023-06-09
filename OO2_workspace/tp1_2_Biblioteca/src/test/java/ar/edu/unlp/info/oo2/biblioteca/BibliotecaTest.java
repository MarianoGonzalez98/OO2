package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class BibliotecaTest {
	Biblioteca biblioteca, bibliotecaVacia;
	
	@BeforeEach
	void setUp()  {
		biblioteca = new Biblioteca();
		bibliotecaVacia = new Biblioteca();
		biblioteca.setExporter(new JSONadapter());
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",
		"2345-2"));
	}
	
    @Test
    public void testNombreCompleto() {
        System.out.println(biblioteca.exportarSocios());
        System.out.println(bibliotecaVacia.exportarSocios());
    }

}
