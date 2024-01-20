package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import configDriver.ConfigDriver;

public class SignInPage extends ConfigDriver{
	
	public SignInPage() {
		// TODO Auto-generated method stub
		PageFactory.initElements(webDriver.get(), this);	

	}
	
	@FindBy(how = How.NAME,using = "email")
	public WebElement EnterEmail;
	
	@FindBy(how = How.CLASS_NAME,using = "a-button-input")
	public WebElement Continuesignin;
	
	public void EnterEmail(String user) {
		EnterEmail.sendKeys(user);
		
	}
	
	public void Cont() {
		Continuesignin.click();;
		
	}

}
