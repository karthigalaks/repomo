package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class TwoTest extends Base
{
	@Test
public void testTwo() throws IOException, InterruptedException
{
	System.out.println("This was edited by jega");
	System.out.println("Test two");
	WebDriver driver = intializerDriver();
	driver.get("https://tutorialsninja.com/demo/");
	Thread.sleep(2000);
	driver.close();
}
}
