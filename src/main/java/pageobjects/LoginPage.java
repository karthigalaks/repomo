package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 WebDriver driver;
 public LoginPage(WebDriver driver)
 {
 this.driver = driver;
 PageFactory.initElements(driver, this);
}
 @FindBy(id="input-email")
private WebElement emailaddressField;
 
 @FindBy(id="input-password")
private WebElement passwordField;
 
 @FindBy(xpath="//input[@value='Login']")
 private WebElement loginbuttonField;
 
 public WebElement emailaddressField()
 {
	 return emailaddressField;
 }
 public WebElement passwordField()
 {
	 return passwordField;
 }
 public WebElement loginbuttonField()
 {
	 return loginbuttonField;
 }
}
