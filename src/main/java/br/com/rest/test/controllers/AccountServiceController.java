package br.com.rest.test.controllers;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import br.com.rest.test.model.AccountCreateRequestModel;

public class AccountServiceController {
	
	private static final String ENDPOINT_POST_CREATE_USER = "/accountservice/accountrest/api/v1/register";

	public void realizarCadastro(AccountCreateRequestModel accountCreateRequest) {
		given()//
			.body(accountCreateRequest)//
			.headers("Content-Type", "application/json")//
			.post(ENDPOINT_POST_CREATE_USER)//
			.then()//
			.statusCode(200)//
			.body("response.reason", is("New user created successfully."))//
			.body("response.success", is(true));
	}

}
