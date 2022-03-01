package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test()
  public void signin() 
  {
	  Reporter.log("login feature",true);
  }
  
  @Test(dependsOnMethods = "signin")
  public void logout() 
  {
	  Reporter.log("logout feature",true);
  }
  
}
