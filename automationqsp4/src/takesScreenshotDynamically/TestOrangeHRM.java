package takesScreenshotDynamically;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners (CustomListener.class)
public class TestOrangeHRM extends BaseTest {
	
    @BeforeMethod
    public void setUp()
    {
    	initialization();
    }
    
    @AfterMethod
    public void tearDown()
    {
    	driver.quit();
    }
    
    @Test
    public void testOrangeHRM0()
    {
    	String actualLoginPageTitle = driver.getTitle();
    	SoftAssert softAssert = new SoftAssert();
    	softAssert.assertEquals(actualLoginPageTitle, "OrangeHRM123");
    	softAssert.assertAll();
    }
}
