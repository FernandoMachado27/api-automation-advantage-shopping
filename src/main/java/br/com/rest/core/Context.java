package br.com.rest.core;

public class Context {
	
	private static String token;
	
	public static String getToken() {
		return token;
	}
	
	public static void setToken(String bearerToken) {
		token = bearerToken;
	}

}
