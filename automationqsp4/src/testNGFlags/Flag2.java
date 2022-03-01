package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(description = "this testcase is used to perform the login action")
  public void login() 
  {
	  Reporter.log("Happy shivjayanti");
  }
}
