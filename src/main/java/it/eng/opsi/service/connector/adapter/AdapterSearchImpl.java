package it.eng.opsi.service.connector.adapter;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.eng.opsi.service.connector.beans.OutBean;
import it.eng.opsi.service.connector.service.model.ApplicationPostRequest;
import it.eng.opsi.service.connector.service.model.Search;


/**
 * a Service Adaptation class to transform&adapt IN&OUT messages
 * 
 */



@Component 

public class AdapterSearchImpl implements Adapter{

    @Value("${output.title}")
	String title;

	@Value("${output.language}")
	String language;

    @Value("${output.description}")
	String description;

    

    public   ArrayList<OutBean> adaptOut(Object body) {
      
        final ObjectMapper objectMapper = new ObjectMapper();
        ArrayList<OutBean> adaptOutput = new ArrayList<OutBean>();
        try {
        	Search[] serviceResponse = objectMapper.readValue((String)body, Search[].class);
            for(Search respElem: serviceResponse) {
                OutBean output1 = new OutBean();
                output1.setOutputId(""+respElem.getId());
                output1.setTitle("Search output");
                output1.setDescription("Search output element");
                output1.setType("string");            
                output1.setLanguage(language);
                // Serialize the content
                String content = respElem.getInstitution() + " - " +
                		respElem.getName() + " - " +
                		respElem.getDegree() + " - " + 
                		respElem.getSemester() + " - " +
                        "From: " + respElem.getApplicationPeriodFrom() + " To: " +
                        respElem.getApplicationPeriodTo();
                //Encode the Content String
                output1.setContent(content.getBytes());
                output1.setContentType("text/plain");
                adaptOutput.add(output1);
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }

        return adaptOutput;
    }
    
    
    
   public ApplicationPostRequest adaptIn(Object body) {
    	
    	 	
         
 		return null;
    	
    }
    
    
}
