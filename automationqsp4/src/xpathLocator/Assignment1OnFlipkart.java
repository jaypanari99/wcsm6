package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1OnFlipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();   // click on search textbox
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("Laptops");  // sending Laptop in Search box
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();  // click on search 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Core i5']")).click();    // click on processor i5
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();    // clicking on Brand
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='HP']")).click();   // click on HP checkbox
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[contains(text(),'Operating System')]")).click();   // click on operating system
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='Windows 10']")).click();   // click on operating system
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[contains(text(),'4★ & above')]")).click();
	    
	   
	    
	    
		

	}

}
