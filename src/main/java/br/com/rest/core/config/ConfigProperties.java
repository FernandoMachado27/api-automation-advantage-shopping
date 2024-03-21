package br.com.rest.core.config;

import java.io.InputStream;
import java.util.Properties;

public class ConfigProperties {
	
	private Properties p;
	private String resource = "config/config.properties";
	
	public ConfigProperties() {
		try {
			InputStream input = this.getClass().getClassLoader().getResourceAsStream(resource);
			p = new Properties();
			p.load(input);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public String getBaseUrl() {
		return p.getProperty("baseUrl");
	}

}
