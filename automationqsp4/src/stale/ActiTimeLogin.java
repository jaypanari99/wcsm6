package stale;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=7f930h1g39tct");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		
		driver.navigate().refresh();
		
		Thread.sleep(4000);
		username.clear(); // StaleElementReferenceException
		
		

	}

}
