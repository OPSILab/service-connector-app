package it.eng.opsi.service.connector.adapter;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.eng.opsi.service.connector.beans.OutBean;
import it.eng.opsi.service.connector.service.model.ApplicationPostRequest;

/**
 * a Service Adaptation class to transform&adapt IN&OUT messages
 * 
 */

@Component

public class AdapterApplicationImpl implements Adapter {

	public ArrayList<OutBean> adaptOut(Object body) {

		ArrayList<OutBean> adaptOutput = new ArrayList<OutBean>();
		try {
			OutBean output1 = new OutBean();
			output1.setOutputId("1");
			output1.setTitle("Application output");
			output1.setDescription("Application output element");
			output1.setType("string");
			output1.setLanguage("English");
	// Serialize the content
			String content = this.OjbToJSON(body);
	// Encode the Content String
			output1.setContent(content.getBytes());

			output1.setContentType("application/json");
			adaptOutput.add(output1);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}

		return adaptOutput;
	}

	public ApplicationPostRequest adaptIn(Object body) {

		ApplicationPostRequest request = new ApplicationPostRequest();
		
		return request;

	}

	public String OjbToJSON(Object obj) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();

		String json = mapper.writeValueAsString(obj);
		return json;

	}

}
