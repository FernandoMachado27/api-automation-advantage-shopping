package br.com.rest.test.hooks;

import br.com.rest.core.config.ConfigProperties;
import io.cucumber.java.BeforeAll;
import io.restassured.RestAssured;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Hooks {
	
	@BeforeAll
	public static void setup() {
		log.info("Iniciando os testes de API");
		ConfigProperties configProperties = new ConfigProperties();
		RestAssured.baseURI = configProperties.getBaseUrl();
	}

}
