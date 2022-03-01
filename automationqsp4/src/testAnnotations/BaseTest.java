package testAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {
	WebDriver driver;
	

  @BeforeMethod
  public void openBrowser() 
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	  driver.get("http://127.0.0.1/login.do;jsessionid=8bbsq37f88i8r");
  }

  @AfterMethod
  public void closeBrowser() 
  {
	  driver.quit();
  }

}
