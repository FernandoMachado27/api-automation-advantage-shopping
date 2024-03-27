package br.com.rest.test.utils;

import java.util.Random;

public class Utils {
	
	private Random random = new Random();
	
	public String loginRandom() {
		String letrasENumeros = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 10; i++) {
			int index = random.nextInt(letrasENumeros.length());
			char randomChar = letrasENumeros.charAt(index);
			sb.append(randomChar);
		}
		
		return "Login" + sb.toString();
	}

}
