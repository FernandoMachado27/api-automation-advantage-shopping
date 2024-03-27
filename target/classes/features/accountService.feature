#language: pt
#encoding: UTF-8

Funcionalidade: Controldor de contas

	#/accountrest/api/v1/register
	@account  @cadastrar_conta
	Cenario: ID_0001 - Cadastrar nova conta
		Dado que realizo o cadastro de nova conta "<ACCOUNTTYPE>" "<ADDRESS>" "<PROMOTION>" "<AOB>" "<CITY>" "<COUNTRY>" "<EMAIL>" "<FIRSTNAME>" "<LASTNAME>" "<PASS>" "<PHONE>" "<STATE>" "<ZIP>"
		
		Exemplos: 
      | ACCOUNTTYPE	| ADDRESS 			|	PROMOTION	|	AOB			|	CITY			|	COUNTRY		|	EMAIL						|	FIRSTNAME	|	LASTNAME	|	PASS			|	PHONE				|	STATE			|	ZIP				|
      | USER 				| Rua de teste  |	true			|	true		|	São Paulo	|	BRAZIL_BR	|	Teste@teste.com	|	Teste			|	Testando	|	Teste@123	|	11876352786	|	São Paulo	|	06343000	|