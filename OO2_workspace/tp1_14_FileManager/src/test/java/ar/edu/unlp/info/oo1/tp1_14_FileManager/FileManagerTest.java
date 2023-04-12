package ar.edu.unlp.info.oo1.tp1_14_FileManager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileManagerTest {
	
	FileOO2 fileManager;
	ArchivoComponent archivo1,conExtension,conNombre;
	@BeforeEach
	void setUp() throws Exception {
		fileManager = new FileOO2();
		archivo1 = new Archivo("examen",".txt");
		conNombre = new ConcatenaNombre(archivo1);
		conExtension = new ConcatenaExtension(conNombre);
		fileManager.agregarArchivo(conExtension);
	}

	@Test
	void test() {
		
		assertEquals("examen - .txt - ", fileManager.printArchivos());
	}

}
