package pageObjectModel;

import java.io.IOException;

public class TestActiTimeValidLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		
    BaseTest bt = new BaseTest();
    bt.openBrowser();  // OPEN THE BROWSER AND LAUNCH THE WEB APP
    
   
   // lp.sendUsername();
    //lp.delayOfTwoSeconds();
    
    //lp.sendPassword();
    //lp.delayOfTwoSeconds();
    
    //lp.clickOnLoginButton();
    //lp.delayOfTwoSeconds();
    
    LoginPage lp = new LoginPage(driver);
    
    
    Flib flib = new Flib();
    String validUsername = flib.readPropertyData(PROP_PATH, "un");
    String validpassword = flib.readPropertyData(PROP_PATH, "pass");
    
    lp.validLogin(validUsername, validpassword);// valid login
    bt.closeBrowser();
    
    
 
	}

}
