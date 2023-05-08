package it.eng.opsi.service.connector;

import java.util.ArrayList;
import javax.ws.rs.core.MediaType;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import it.eng.opsi.service.connector.adapter.Adapter;
import it.eng.opsi.service.connector.adapter.AdapterApplicationImpl;
import it.eng.opsi.service.connector.adapter.AdapterSearchImpl;
import it.eng.opsi.service.connector.beans.OutBean;
import it.eng.opsi.service.connector.service.ClientService;
import it.eng.opsi.service.connector.service.model.ApplicationPostRequest;

@Component
class AdapterRoute extends RouteBuilder {
	
	@Value("${service.url}")
	String serviceurl;

	@Value("${adapter.api.path}")
	String contextPath;
	
	@Bean
	ServletRegistrationBean<CamelHttpTransportServlet> servletRegistrationBean() {

		ServletRegistrationBean<CamelHttpTransportServlet> servlet = new ServletRegistrationBean<CamelHttpTransportServlet>(new CamelHttpTransportServlet(),
				contextPath+ "/*");
		servlet.setName("CamelServlet");
		return servlet;
	}

	@Override
	public void configure() {

		// Expose API DOCS (e.g. http://localhost:8080/adapter/api-doc)
		restConfiguration()//
				.enableCORS(true).apiContextPath("/api-doc")
				.apiProperty("api.title", "Adapter REST API").apiProperty("api.version", "v1")
				.apiProperty("cors", "true") // cross-site
				.apiContextRouteId("doc-api").component("servlet").bindingMode(RestBindingMode.json)
				.dataFormatProperty("prettyPrint", "true");
		
        // REST endpoints to wrap&adapt the remote service api to adapt
		rest("/applications").description("GET REST Service adaptation").id("api-route").produces(MediaType.APPLICATION_JSON)
				.consumes(MediaType.APPLICATION_JSON).bindingMode(RestBindingMode.auto)
			
				
			.get("/search?institution={institution}&subject={subject}&federalStateId={federalStateId}")
				.outType(OutBean.class)
				.enableCORS(true)
				.route()
				.process(new Processor() {
					/* to invoke [GET] the remote service */
						@Override
						public void process(Exchange exchange) throws Exception {

						    String institution=(String)exchange.getIn().getHeader("institution");
						    String subject=(String)exchange.getIn().getHeader("subject");
						    String federalStateId=(String)exchange.getIn().getHeader("federalStateId");
						    
							String response = ClientService.invokeGET(serviceurl+"/search?" 
								    +"institution="+(institution!=null?institution:"")
						        	+(subject!=null?"&subject="+subject:"")
						        	+(federalStateId!=null?"&federalStateId="+federalStateId:""));
							exchange.getIn().setBody(response);
						}
					})
					/* to invoke the output adaptation */
					.process(new Processor() {
	
						@Override
						public void process(Exchange exchange) throws Exception {
							Object bodyOut = exchange.getIn().getBody();
							Adapter adapter= new AdapterSearchImpl();
							ArrayList<OutBean> out = adapter.adaptOut(bodyOut);
							exchange.getIn().setBody(out);
						}
					})
					.endRest();
				

								
		rest("/applications").description("POST REST Service adaptation").id("api-route").produces(MediaType.APPLICATION_JSON)
		    .consumes(MediaType.APPLICATION_JSON).bindingMode(RestBindingMode.auto)	
			
		    .post()
				.type(ApplicationPostRequest.class)
				.enableCORS(true)
				.outType(OutBean.class)
				.route()
				/* to invoke the POST input adaptation */
				.process(new Processor() {					
					@Override
					public void process(Exchange exchange) throws Exception {
						Object body = exchange.getIn().getBody();
						Adapter adapter= new AdapterSearchImpl();
						Object in = adapter.adaptIn(body);
						exchange.getIn().setBody(in);
					}
				})
				/* to invoke the remote service */
				.process(new Processor() {					
					@Override
					public void process(Exchange exchange) throws Exception {
						Object bodyIn =  exchange.getIn().getBody();
						String response = ClientService.invokePOST(bodyIn, serviceurl);
						exchange.getIn().setBody(response);
					}
					})
				/* to invoke the output adaptation */
				.process(new Processor() {

					@Override
					public void process(Exchange exchange) throws Exception {
						Object bodyOut = exchange.getIn().getBody();
						Adapter adapter= new AdapterApplicationImpl();
						ArrayList<OutBean> out = adapter.adaptOut(bodyOut);
						exchange.getIn().setBody(out);
					}
				})
				.endRest();

		
		
		
		
		
	}
}