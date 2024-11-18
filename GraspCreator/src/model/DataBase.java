package model;

import java.util.HashMap;
import java.util.Map;

public class DataBase {

	private static Map<String, String[]> products = new HashMap<String, String[]>();
	
	static {
		products.put("at", new String[]{"Arroz Tatiana", "30"});
		products.put("fd", new String[]{"Feijão do Dia", "20"});
		products.put("msa", new String[]{"Macarrão Santa Amalia", "15"});
		
	}
	
	public static String[] selectProduct(String code) {
		return products.get(code);
	}
}
