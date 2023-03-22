package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONadapter extends VoorheesExporter{

	
	public String exportar(List<Socio> socios) {
		JSONArray jsonArray = new JSONArray();
		socios.forEach( s -> jsonArray.add(this.socioAJson(s)));
		return jsonArray.toJSONString();
	}
	
	private JSONObject socioAJson(Socio socio) {
		JSONObject json = new JSONObject();
		json.put("nombre", socio.getNombre());
		json.put("email", socio.getEmail());
		json.put("legajo", socio.getLegajo());
		
		return json;
	}
	
	// https://stackoverflow.com/questions/35453110/json-simple-causes-compiler-warning-type-safety-the-method-putobject-object
}
