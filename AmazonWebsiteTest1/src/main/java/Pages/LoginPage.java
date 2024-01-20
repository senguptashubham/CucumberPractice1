package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import configDriver.ConfigDriver;

public class LoginPage extends ConfigDriver {
	
	

	public LoginPage() {
		// TODO Auto-generated method stub
		PageFactory.initElements(webDriver.get(), this);	

	}
	
	@FindBy(how = How.CLASS_NAME,using="nav-line-1-container")
	public WebElement SigninBTN;

	
	public void ClickSignin() {
		SigninBTN.click();
		
	}
	
	
	


}
