package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test
  public void signin() 
  {
	  int i=0;
	  int result=9/i;
	  Reporter.log("Login feature",true);
  }
  
  @Test(dependsOnMethods = "signin",alwaysRun = true)
  public void logout() 
  {
	  
	  Reporter.log("logout feature,true");
  }
}
