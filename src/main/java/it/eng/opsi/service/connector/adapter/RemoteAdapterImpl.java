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

    public ArrayList<OutBean> adaptOut(Object body) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newBuilder()
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:5500/api/mapper"))
                .POST(BodyPublishers.ofString(
                        "{\"sourceDataType\" : \".json\",\"sourceData\": [{\"institution\" : \"University\",\"name\" : \"UNIPA\",\"degree\":\"master\",\"semester\":\"1\",\"applicationPeriodFrom\":\"01/10/2022\",\"applicationPeriodTo\":\"01/03/2023\"}], \"adapterID\" : \"search1\"}"))
                .setHeader("Content-Type", "application/json")
                .build();

        HttpResponse<String> response;// = new HttpResponse<ArrayList<OutBean>>();

        // try {
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        ObjectMapper mapper = new ObjectMapper();

        // De-serialize to an object
        ArrayList<OutBean> mapped = mapper.readValue(response.body(), ArrayList.class);

        return mapped;
    }

    public ApplicationPostRequest adaptIn(Object body) {

        return null;

    }

}
