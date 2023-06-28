package it.eng.opsi.service.connector.adapter;

import java.util.ArrayList;
import java.util.Optional;

import javax.net.ssl.SSLSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.eng.opsi.service.connector.beans.OutBean;
import it.eng.opsi.service.connector.service.model.ApplicationPostRequest;
import it.eng.opsi.service.connector.service.model.Search;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;

//import org.json.*;

/**
 * a Service Adaptation class to transform&adapt IN&OUT messages
 * 
 */

@Component

public class RemoteAdapterImpl implements Adapter {

    @Value("${output.title}")
    String title;

    @Value("${output.language}")
    String language;

    @Value("${output.description}")
    String description;

    @Value("${remoteAdapterURL}")
    String remoteAdapterURL;

    @Value("${remoteAdapterApplicationID}")
    String remoteAdapterApplicationID;

    @Value("${remoteAdapterSearchID}")
    String remoteAdapterSearchID;

    public ArrayList<OutBean> adaptOut(Object body) throws IOException, InterruptedException {

        ObjectMapper mapper = new ObjectMapper();

        HttpClient client = HttpClient.newBuilder()
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(remoteAdapterURL))
                .POST(BodyPublishers.ofString("{\"sourceDataType\" : \"json\",\"sourceData\": "+body+", \"adapterID\" : \""+remoteAdapterSearchID+"\", \"config\" : {\"entityNameField\" : \"title\"}}"))
                .setHeader("Content-Type", "application/json")
                .build();

        HttpResponse<String> response;// = new HttpResponse<ArrayList<OutBean>>();

        response = client.send(request, HttpResponse.BodyHandlers.ofString());
  
        ArrayList<OutBean> mapped = mapper.readValue(response.body(), ArrayList.class);

        return mapped;
    }

    public ApplicationPostRequest adaptIn(Object body) {

        return null;

    }

}
