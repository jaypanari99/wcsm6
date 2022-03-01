package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
  @Test
  public void signin() 
  {
	  int i=0;
	  int result=9/i;
	  Reporter.log("login feature,true");
  }
  
  @Test(dependsOnMethods = "signin")
  public void logout() 
  {
	  
	  Reporter.log("login feature,true");
  }
}
