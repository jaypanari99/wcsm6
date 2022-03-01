package pageObjectModel;

import java.io.IOException;

public class TestActiTimeLogout extends BaseTest {

	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
	    bt.openBrowser(); 
	    LoginPage lp = new LoginPage(driver);
	    
	    Flib flib = new Flib();
	    String validUsername = flib.readPropertyData(PROP_PATH, "un");
	    String validpassword = flib.readPropertyData(PROP_PATH, "pass"); 
	    lp.validLogin(validUsername, validpassword);
	    
	    HomePage hp = new HomePage(driver);
	    hp.logout();

	}

}
