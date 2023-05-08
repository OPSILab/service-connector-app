package it.eng.opsi.service.connector.service;

import java.net.URI;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;



@Component

/**
 * a Service Client bean to invoke and consume api endpoints
 * 
 */
public class ClientService {
	

	
    public static String invokePOST(Object bodyIn, String serviceurl) {
    	   	   	          	
    	RestTemplate restTemplate = new RestTemplate();
               try {
                	
		  ResponseEntity<String> response = restTemplate.exchange(
					RequestEntity.post(URI.create(serviceurl)).body(bodyIn),
					String.class);
        	return  response.getBody();
		} catch (RestClientException e1) {			
			e1.printStackTrace();			
     }        
      return null;        
        
    }
    
    public static String invokeGET(String request) {
	          	
    	RestTemplate restTemplate = new RestTemplate();
        
        try {
        	ResponseEntity<String> response
				  = restTemplate.getForEntity(request, String.class);
        	return  response.getBody();
		} catch (RestClientException e1) {			
			e1.printStackTrace();			
     }        
      return null;        
        
    }
}
