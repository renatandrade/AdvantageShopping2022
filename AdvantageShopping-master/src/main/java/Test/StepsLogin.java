package Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.BasePage;

public class StepsLogin {

	BasePage basePage = new BasePage();
	
	@And("^preencho login de usuario$")	
	public void preencho_o_nome_de_usuario_para_login() {
		basePage.fillTxtUserNameLogin();
	}
	
	@And("^preencho senha para logar$")
	public void preencho_senha_para_logar() throws Throwable {
		basePage.fillTxtPasswordLogin();
	}

	
	@Then("^efetuo o login clicando no botao Sign in$")
	public void efetuo_o_login_clicando_no_botao_Sign_in() throws Throwable {	
		basePage.clickBtnSingIn();
	}
}