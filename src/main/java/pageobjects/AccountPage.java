package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	
	WebDriver driver;
	public AccountPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Edit your account information")
	//encapsulating the webelement in page object model in their respective class
	private WebElement EditAccountInformation;
	//using this methods only we have access not directly
	public WebElement EditAccountInformation()
	{
		return EditAccountInformation;
	}
}
