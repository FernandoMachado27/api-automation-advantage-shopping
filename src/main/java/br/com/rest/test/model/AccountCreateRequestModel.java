package br.com.rest.test.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class AccountCreateRequestModel {
	
	private String accountType;
	private String address;
	private Boolean allowOffersPromotion;
	private Boolean aobUser;
	private String cityName;
	private String country;
	private String email;
	private String firstName;
	private String lastName;
	private String loginName;
	private String password;
	private String phoneNumber;
	private String stateProvince;
	private String zipcode;

}
