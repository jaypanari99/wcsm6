package testNGParallelClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 {
	WebDriver driver;
	  @Test
	  public void test3() 
	  {
		  driver.switchTo().activeElement().sendKeys("rcb",Keys.ENTER);
		  
	  }
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		  driver.get("http://www.google.com");
	  }

	  @AfterMethod
	  public void afterMethod() 
	  {
		  driver.close();
	  }

}
