package dynamicWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitUse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=1hsdlusps5hpm");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("usernamesuraj1234578b")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		driver.findElement(By.id("loginButton")).click();
//		
//		
//		
//		driver.findElement(By.linkText("Users")).click();
//		
//		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
//		
//		
//		
//		//form filling
//		driver.findElement(By.name("username")).sendKeys("chetan");
//		driver.findElement(By.name("passwordText")).sendKeys("chetan@1234");
//		driver.findElement(By.name("passwordTextRetype")).sendKeys("chetan@1234");
//		driver.findElement(By.name("firstName")).sendKeys("chetan");
//		driver.findElement(By.name("lastName")).sendKeys("rathod");
//		
//		
//		driver.findElement(By.xpath("//input[contains(@value,'Create')]")).click();

	}

}
