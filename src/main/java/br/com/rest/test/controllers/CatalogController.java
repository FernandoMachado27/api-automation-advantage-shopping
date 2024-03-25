package br.com.rest.test.controllers;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class CatalogController {
	
	private static final String ENDPOINT_GET_ALL_PRODUCTS_INFO = "/catalog/api/v1/products";

	public void buscarInfoDosProdutos() {
		given()//
			.headers("Content-Type", "application/json")
			.get(ENDPOINT_GET_ALL_PRODUCTS_INFO)
			.then()
			.statusCode(200)
			.body("products.productName[0]", is("Beats Studio 2 Over-Ear Matte Black Headphones"));
	}

}
