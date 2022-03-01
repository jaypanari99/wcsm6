package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComparingTitlePageAndHomePageOfActitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=h1c0jgn58qdf3");
		Thread.sleep(3000);    
		
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals("actiTIME - Login"))
		{
			System.out.println("THE lOGIN PAGE TITLE IS VERIFIED! TEST CASE IS PASSED");
		}
		else
		{
			System.out.println("THE lOGIN PAGE TITLE IS NOT VERIFIED! TEST CASE IS FAILED");
		}
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);  // giving this delay is mandatory as it will take time to verify the home page title if we do not give delay the it will compare home page title with the login page title
		
		String actualHomePageTitle = driver.getTitle();
		
		if(actualHomePageTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("THE HOME PAGE TITLE IS VERIFIED! TEST CASE IS PASSED");
		}
		else
		{
			System.out.println("THE HOME PAGE TITLE IS NOT VERIFIED! TEST CASE IS FAILED");
		}

	}

}
