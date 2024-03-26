package br.com.rest.test.steps;

import br.com.rest.test.controllers.AccountServiceController;
import br.com.rest.test.model.AccountCreateRequestModel;
import io.cucumber.java.pt.Dado;

public class AccountServiceSteps {
	
	AccountServiceController accountServiceController;
	
	public AccountServiceSteps() {
		accountServiceController = new AccountServiceController();
	}
	 
	@Dado("que realizo o cadastro de nova conta {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void queRealizoOCadastroDeNovaConta(String accountType, String address, String promotion, String aob, String city, String country, String email, String firstName, String lastName, String login, String pass, String phone, String state, String zip) {
		
		AccountCreateRequestModel accountCreateRequestModel = AccountCreateRequestModel.builder()
				.accountType(accountType)
				.address(address)
				.allowOffersPromotion(Boolean.parseBoolean(promotion))
				.aobUser(Boolean.parseBoolean(aob))
				.cityName(city)
				.country(country)
				.email(email)
				.firstName(firstName)
				.lastName(lastName)
				.loginName(login)
				.password(pass)
				.phoneNumber(phone)
				.stateProvince(state)
				.zipcode(zip)
				.build();
		
		accountServiceController.realizarCadastro(accountCreateRequestModel);
	}

}
