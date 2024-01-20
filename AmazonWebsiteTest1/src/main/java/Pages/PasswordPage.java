package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import configDriver.ConfigDriver;

public class PasswordPage extends ConfigDriver{
	
	public PasswordPage() {
		// TODO Auto-generated method stub
		PageFactory.initElements(webDriver.get(), this);	

	}
	
	@FindBy(how = How.ID,using = "ap_password")
	public WebElement Enterpassword;
	
	@FindBy(how = How.ID,using = "signInSubmit")
	public WebElement signButton;
	
	public void Enterpassword(String pass) {
		Enterpassword.sendKeys(pass);
		
	}
	public void signButton() {
		signButton.click();
		
	}

}
