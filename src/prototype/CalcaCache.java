package prototype;

import java.util.HashMap;
import java.util.Map;

public class CalcaCache {
	
	private static Map<String, Calca> calcaCache = new HashMap<String, Calca>(); 
	
	
	/*
	 * Recuperando do cache calças clonadas
	 */
	public static Calca getCalca(String calcaId) {
	      Calca cache = calcaCache.get(calcaId);
	      return (Calca) cache.clone();
	}

	   /*
	    * Criando diferentes tipos de calça e adicionando em cache.
	    */
	   
	   public static void loadCache() {
	      Jeans calcaJeans = new Jeans();
	      calcaJeans.setId("jeans");
	      calcaCache.put(calcaJeans.getId(),calcaJeans);

	      Legging legging = new Legging();
	      legging.setId("legging");
	      calcaCache.put(legging.getId(),legging);

	      Moleton moleton = new Moleton();
	      moleton.setId("moleton");
	      calcaCache.put(moleton.getId(), moleton);
	   }
	

}
