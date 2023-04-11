package ar.edu.unlp.info.oo1.tp1_13_AccesoBD;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DatabaseRealAccessTest {
	private DatabaseAccess dbInsegura,dbSegura;
	@BeforeEach
	void setUp() throws Exception {
		this.dbInsegura = new DatabaseRealAccess();
		this.dbSegura = new DatabaseConAutenticacion("123456");
	}

    @Test
    void testGetSearchResults() {
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.dbInsegura.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.dbInsegura.getSearchResults("select * from comics where id=10"));
        assertEquals(null, dbSegura.getSearchResults("select * from comics where id=1"));
        
        ((DatabaseConAutenticacion)dbSegura).login("12345678"); //esto se haria desde console write line
        assertEquals(null, dbSegura.getSearchResults("select * from comics where id=1"));
        
        ((DatabaseConAutenticacion)dbSegura).login("123456"); //esto se haria desde console write line
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.dbSegura.getSearchResults("select * from comics where id=1"));
    }
    
    @Test
    void testInsertNewRow() {
        assertEquals(3, this.dbInsegura.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.dbInsegura.getSearchResults("select * from comics where id=3"));
    }
}
