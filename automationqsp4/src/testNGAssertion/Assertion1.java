package testNGAssertion;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion1 {
  @Test
  public void TestScript1() 
  { 
	  
  Reporter.log("open the browser",true);
  Reporter.log("launch the web app",true);
  
  SoftAssert softassert = new SoftAssert();
  softassert.assertEquals(false, true);
  Reporter.log("verify the login page title",true);
  
  
  Reporter.log("send password",true);
  Reporter.log("click on login button",true);
  Reporter.log("verify the home page title",true);
  Reporter.log("create user",true);
  Reporter.log("delete user",true);
  
  softassert.assertAll(); // this we have to write to mark the script as fail in case of soft assert
	  // hard assert static methods Assert.assertEquals()
	  // soft assert non static methods we have to create Object of Assert class
      // in soft assert even id the test script is failed the next set of lines will be executes but show test case status as fail
  // in case of hard assert if the script is failed next set of lines wont be executed
  // we have to use hard asset only for critical features
  // we can use soft asset for features whic are h=not critical
  
  
  }
}
