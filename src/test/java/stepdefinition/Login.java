package stepdefinition;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.AccountPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

public class Login extends Base {
  WebDriver driver;
  LandingPage landingPage ;
  LoginPage loginPage;
	AccountPage accountPage;
	@Before
	@Given("^Open any Browser$")
	public void open_any_browser() throws IOException {
		driver = intializerDriver();
	}
	@Given("^Navigate to Login page$")
	public void navigate_to_login_page() throws InterruptedException {
		driver.get(prop.getProperty("url"));
		 landingPage = new LandingPage(driver);
		landingPage.myAccountDropdown().click();
		landingPage.loginOption().click();
		Thread.sleep(3000);
	}
	@When("User enters username as {string} and password as {string} into the fields")
	public void user_enters_username_as_and_password_as_into_the_fields(String email, String password)
	{
		 loginPage = new LoginPage(driver);
			loginPage.emailaddressField().sendKeys(email);
			loginPage.passwordField().sendKeys(password);
	}
	@When("^User clicks on Login button$")
	public void user_clicks_on_login_button() throws InterruptedException {
		loginPage.loginbuttonField().click();
		
	}
	@Then("^Verify user is able to successfully login$")
	public void verify_user_is_able_to_successfully_login() {
		 accountPage = new AccountPage(driver);
			Assert.assertTrue(accountPage.EditAccountInformation().isDisplayed()); 
	}


@After
public void closeBrowser()
{
	driver.close();
}
	
}
