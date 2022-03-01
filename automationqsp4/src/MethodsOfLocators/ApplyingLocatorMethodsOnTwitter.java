package MethodsOfLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplyingLocatorMethodsOnTwitter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D");
		
		driver.findElement(By.name("text")).sendKeys("Username");
		Thread.sleep(3000);
		driver.findElement(By.className("css-1dbjc4n r-14lw9ot r-16y2uox r-1wbh5a")).click();
        
	}

}
