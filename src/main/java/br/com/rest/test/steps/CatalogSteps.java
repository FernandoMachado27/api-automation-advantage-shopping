package br.com.rest.test.steps;

import br.com.rest.test.controller.CatalogController;
import io.cucumber.java.pt.Dado;
public class CatalogSteps {
	
	private CatalogController catalogController;
	
	public CatalogSteps() {
		catalogController = new CatalogController();
	}
	
	@Dado("que realizo a busca apenas por todas informações dos produtos")
	public void queRealizoABuscaApenasPorTodasInformaçõesDosProdutos() {
		catalogController.buscarInfoDosProdutos();
	}

}
