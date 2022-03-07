package Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;

public class StepsConsultarProdutosEAdicionarNoCarrinho {

	BasePage basePage = new BasePage();

	@And("na pagina home ja logada clico em our products")
	public void na_pagina_home_ja_logada_clico_em_our_productsnavego_pelos_produtos_na_categoria_laptops() throws Throwable {
		basePage.validationPageHome();
	}
	
	@When("navego pela pagina our products")
	public void navego_pela_pagina_our_products() throws Throwable {
		basePage.clickBtnOurProducts();
	}

	@And("clico na categoria laptops")
	public void clico_na_categoria_laptops() throws Throwable {
		basePage.clickBtnLaptops();
	}
		

	@And("clico na imagem do laptop hp g1 es")
	public void clico_na_imagem_do_laptop_hp_g1_es() throws Throwable {
		basePage.clickBtnImage();
	}

	@And("clico no botao add to cart")
	public void clico_no_botao_add_to_cart() throws Throwable {
		basePage.clickBtnAddToCart();
	}

	@And("clico no botao do menuCart")
	public void clico_no_botao_do_menuCart() throws Throwable {
		basePage.clickBtnMenuCart();
	}

	@Then("valido que o produto foi adicionado no carrinho")
	public void valido_que_o_produto_foi_adicionado_no_carrinho() throws Throwable {
		basePage.validateTxtShoppingCarts();
	}
	
	@And("efetuo o logout")
	public void efetuo_o_logout() throws Throwable {
		basePage.clickBtnSignOut();
	}
}
