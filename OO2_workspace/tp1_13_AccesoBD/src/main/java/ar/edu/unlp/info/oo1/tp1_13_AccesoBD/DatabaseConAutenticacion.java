package ar.edu.unlp.info.oo1.tp1_13_AccesoBD;

import java.util.Collection;
import java.util.List;

public class DatabaseConAutenticacion implements DatabaseAccess{

	private String password;
	private boolean autenticado;
	private DatabaseAccess db;
	public DatabaseConAutenticacion(String password) {
		this.password = password;
		this.autenticado = false;
		this.db = new DatabaseRealAccess();
	}
	
	public Collection<String> getSearchResults(String queryString) {
		if (!autenticado) {
			return null;			
		}
		return db.getSearchResults(queryString);
	}

	public int insertNewRow(List<String> rowData) {
		if (!autenticado) {			
			return -1;
		}
		return db.insertNewRow(rowData);
	}
	
	public boolean login(String password) {
		if (this.password == password) {
			autenticado=true;
			return true;
		}
		return false;
	}

}
