package it.eng.opsi.service.connector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.resource.servlet.OAuth2ResourceServerAutoConfiguration;
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
import org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration;

import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = { WebSocketServletAutoConfiguration.class, AopAutoConfiguration.class,
		OAuth2ResourceServerAutoConfiguration.class, EmbeddedWebServerFactoryCustomizerAutoConfiguration.class })
@ComponentScan(basePackages = "it.eng.opsi.service.connector")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	

	
}
