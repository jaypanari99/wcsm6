package testAnnotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ActiTimeValidLogin extends BaseTest{
  @Test
  public void test() 
  {
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
  }
}
