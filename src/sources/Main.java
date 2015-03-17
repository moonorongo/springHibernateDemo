package sources;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashSet;

import sources.Cd;
import sources.CdBo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;



public class Main {

	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper();
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CdBo cdBo = (CdBo) context.getBean("cdBo");

		// ejemplo lectura - conversion a json
		Cd cd = cdBo.findByTitulo("titulo");
		System.out.println("ejemplo lectura - conversion a json ----------------------------");
		try {
			System.out.println(mapper.writeValueAsString(cd));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
 		}
		
		

		
		// ejemplo parseo e insercion 
		System.out.println("ejemplo parseo e insercion ----------------------------");

    	String jsonNewCd = "{"
    			+ "\"titulo\":\"Sudrealismo\", ";
    	
    	jsonNewCd += "\"temas\": [{"
    				+ "\"titulo\":\"World Music\"},{"
    				+ "\"titulo\":\"Oración del remanso\"},{"
    				+ "\"titulo\":\"Pasó el tiempo\"},{"
    				+ "\"titulo\":\"Desafinado\"},{"
    				+ "\"titulo\":\"A mi lado\"}]}";
    	
    	Cd model = null;
		try {
			model = mapper.readValue(jsonNewCd, Cd.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	for(Tema t : model.getTemas()) {
    		t.setCd(model);
    	}
    	
    	cdBo.save(model);
    	
		// ejemplo actualizacion 
		System.out.println("ejemplo Actualizacion ----------------------------");

		model.setTitulo("SudRealismo - Cabernet sauvignon");
		
		// agrego un registro
		Tema added = new Tema();
		added.setCd(model);
		added.setTitulo("este lo agregue");
		model.getTemas().add(added);
		
		for(Tema t : model.getTemas()) {
			t.setTitulo(t.getTitulo()+ " -- modified");
		}
		
		cdBo.update(model);
	}

}
