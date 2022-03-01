package MethodsOfLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplyingLocatorMethodsOnFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("User");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("User123");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		

	}

}
