package pages;

import static core.DriverFactory.getDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends WebLogic {


	// Dados para cadastro de novo usuario
	public void btnIconeUser() {
		clickButton(By.id("menuUser"));
	}
	
	public void clickCreateNewAccount() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".create-new-account")));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".create-new-account")));
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", element);
	}

	public void fillTxtNewUserName() {
		write(By.name("usernameRegisterPage"), "Test0014");
	}
	
	public void fillTxtUserName() {
		write(By.name("usernameRegisterPage"), "Test0054");
	}

	public void fillTxtNewEmail() {
		write(By.name("emailRegisterPage"), "alanna.l@gmail.com");
	}
	
	public void fillTxtEmail() {
		write(By.name("emailRegisterPage"), "brenda.c@gmail.com");
	}

	public void fillTxtPassword() {
		write(By.name("passwordRegisterPage"), "1D458h962");
	}

	public void fillTxtConfirmPassword() {
		write(By.name("confirm_passwordRegisterPage"), "1D458h962");
	}

	public void fillTxtFirstName() {
		write(By.name("first_nameRegisterPage"), "Alana");
	}

	public void fillTxtLastName() {
		write(By.name("last_nameRegisterPage"), "Lima");
	}

	public void fillTxtTelephon() {
		write(By.name("phone_numberRegisterPage"), "000000000");
	}

	public void selectCountry() {
		selectCombo(By.name("countryListboxRegisterPage"), "Brazil");
	}

	public void fillTxtCity() {
		write(By.name("cityRegisterPage"), "Sao Paulo");
	}

	public void fillTxtAddress() {
		write(By.name("addressRegisterPage"), "Bragança street");
	}

	public void fillTxtState() {
		write(By.name("state_/_province_/_regionRegisterPage"), "SP");
	}

	public void fillTxtPostalCode() {
		write(By.name("postal_codeRegisterPage"), "01236-020");
	}

	
	public void selectCheckBoxPrivaci() {
		clickButton(By.name("i_agree"));
	}

	public void clickBtnRegister() {
		clickButton(By.id("register_btnundefined"));
	}

	public void fillTxtUserNameLogin() {
		write(By.name("username"), "Test0054");
	}

	public void fillTxtPasswordLogin() {
		write(By.name("password"), "1D458h962");
	}
	
	public void clickBtnSingIn() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign_in_btnundefined")));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("sign_in_btnundefined")));
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", element);
	}

	public String validationUser() {
		return getText(By.linkText("Test0054"));
	}

	public String validationLogin() {
		return getText(By.linkText("Test0054"));

	}
	
	public void clickBtnLaptops() {
		clickButton(By.id("laptopsImg"));
	}
	
	public void validationPageHome( ) {
		 getText(By.xpath("(//span[@class= 'roboto-medium ng-binding'])[2]"));
	}
	
	public void clickBtnOurProducts() {
		clickButton(By.xpath("//a[contains(text(), 'OUR PRODUCTS')]"));
	}
	
	public void clickBtnImage() {
		clickButton(By.id("10"));
		
	}
	
	public void clickBtnAddToCart() {
		clickButton(By.xpath("//button[text()='ADD TO CART']"));
	}

	
	public void clickBtnMenuCart() {
		clickButton(By.id("menuCart"));
	}
	
	public String txtShoppingCarts() {
		return getText(By.xpath("//label[@class= 'roboto-regular productName ng-binding']"));
	}
	
	public void validateTxtShoppingCarts() {
		validate("HP CHROMEBOOK 14 G1(ES)", txtShoppingCarts());
	}
	
	public void clickBtnSignOut() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Sign out')])[2]")));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(text(),'Sign out')])[2]")));
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", element);
	}
}
