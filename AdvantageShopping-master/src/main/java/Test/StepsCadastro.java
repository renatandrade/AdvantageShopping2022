package Test;


import core.Browser;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;

public class StepsCadastro {
	
	BasePage basePage = new BasePage();
	Browser browser = new Browser();
	
	@Given("estou na home do Adventure Shopping")
	public void estou_na_home_do_Adventure_Shopping() throws Throwable {
		browser.startBrowser();
	}
	
	@When("clico no botao de usuario")
	public void clico_no_botao_de_usuario() throws Throwable {
		basePage.btnIconeUser();
	}
	
	@And("clico no botao de criar novo usuario")
	public void clico_no_botao_de_criar_novo_usuario() throws Throwable {
		basePage.clickCreateNewAccount();
	}
	
	@And("preencho o nome de usuario")
	public void preencho_o_nome_de_usuario() throws Throwable {
		basePage.fillTxtNewUserName();
	}
	
	@And("preencho o e-mail")
	public void preencho_o_email() throws Throwable {
		basePage.fillTxtNewEmail();
	}
	
	@And("preencho a senha")
	public void preencho_a_senha() throws Throwable {
		basePage.fillTxtPassword();
	}
	
	@And("confirmo a senha")
	public void confirmo_a_senha() throws Throwable {
		basePage.fillTxtConfirmPassword();
	}
	
	@And("preencho o primeiro nome")
	public void  preencho_o_primeiro_nome() throws Throwable {
		basePage.fillTxtFirstName();
	}
	
	@And("preencho o sobrenome")
	public void  preencho_o_sobrenome() throws Throwable {
		basePage.fillTxtLastName();
	}
	
	@And("preencho o numero do telefone")
	public void  preencho_o_numero_do_telefone() throws Throwable {
		basePage.fillTxtTelephon();
	}
	
	@And("seleciono o pais")
	public void seleciono_o_pais() throws Throwable {
		basePage.selectCountry();
	}
	
	@And("preencho a cidade")
	public void preencho_a_cidade() throws Throwable {
		basePage.fillTxtCity();
	}
	
	@And("preencho o endereco")
	public void preencho_o_endereco() throws Throwable {
		basePage.fillTxtAddress();
	}
	
	@And("preencho o estado")
	public void preencho_o_estado() throws Throwable {
	basePage.fillTxtState();
	}
	
	@And("preencho o codigo postal")
	public void preencho_o_codigo_postal() throws Throwable {
		basePage.fillTxtPostalCode();
	}
	
	@And("clico em i agree")
	public void clico_em_i_agree() throws Throwable {
		basePage.selectCheckBoxPrivaci();
	}
	
	@Then("clico no botao register")
	public void clico_no_botao_register() throws Throwable {
		basePage.clickBtnRegister();
	}
}
