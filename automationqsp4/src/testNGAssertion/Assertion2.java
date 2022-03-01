package testNGAssertion;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Assertion2 {
	
	@Test
	public void testOrangeHrm() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String titleOfOrangeHrm = driver.getTitle();
		System.out.println(titleOfOrangeHrm);
	    SoftAssert softassert = new SoftAssert();
	    softassert.assertEquals(titleOfOrangeHrm, "OrangeHRM");
	    WebElement username = driver.findElement(By.name("txtUsername"));
	    boolean statusOfUsernameTextBox = username.isDisplayed();
	    Assert.assertEquals(statusOfUsernameTextBox, true);
	    username.sendKeys("Admin");
	    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    
	    
	    Thread.sleep(3000);
	    String actualHomePageTitle = driver.getTitle();
	    softassert.assertEquals(actualHomePageTitle, "OrangeHRM Dashboard");// as the login page title
	    
	    Reporter.log("create user",true);
		Reporter.log("delete user",true);

		softassert.assertAll();
	    
	    
	    
		
	}

}
