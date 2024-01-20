package StepDefinitions;

import org.testng.Assert;

import Pages.LoginPage;
import Pages.PasswordPage;
import Pages.SignInPage;
import configDriver.ConfigDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends ConfigDriver{
	


	
	
	@Given("^user is already on Amazon page$")
	public void user_is_already_on_Amazon_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions   
		LoginPage page1 = new LoginPage();
		//Assert.assertEquals(Util.getURL(), "https://www.amazon.in");
		page1.ClickSignin();
	}


	@When("^user enters email as ([^\"]*)$")
	public void user_enters_email(String email) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SignInPage page2 = new SignInPage();
		page2.EnterEmail(email);
		page2.Cont();
	}


	@When("^user enters password as ([^\"]*)$")
	public void user_enters_password(String pass) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PasswordPage page3 = new PasswordPage();
		page3.Enterpassword(pass);
		page3.signButton();
	}


	
}
