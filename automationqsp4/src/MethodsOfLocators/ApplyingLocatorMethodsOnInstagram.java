package MethodsOfLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplyingLocatorMethodsOnInstagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		driver.findElement(By.name("username")).sendKeys("Username");
		Thread.sleep(3000);
		driver.findElement(By.name("passsword")).sendKeys("Username123",Keys.ENTER);
		Thread.sleep(3000);
		
		
	}

}
