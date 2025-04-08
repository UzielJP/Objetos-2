package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonAdapter extends VoorheesExporter
{
	
	@Override
	public String exportar(List<Socio> socios)
	{
		
		if (socios.isEmpty()) {
			return "[]";
		}
		JSONObject obj = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		socios.stream().forEach(a->obj.put(a.getLegajo(), a));
		jsonArray.add(obj);
		JSONParser jsonP = new JSONParser();
		try {
			return jsonP.parse(jsonArray.toJSONString()).toString();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "[]";
		}
	}
}
