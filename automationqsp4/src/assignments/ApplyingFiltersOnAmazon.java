package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplyingFiltersOnAmazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[.='Smartphones']")).click();
		driver.findElement(By.xpath("//span[.='MI']")).click();
		driver.findElement(By.id("low-price")).sendKeys("10000");
		driver.findElement(By.id("high-price")).sendKeys("20000");
		driver.findElement(By.xpath(("(//input[@type='submit'])[2]"))).click();
		driver.findElement(By.xpath("//span[.='64 GB']")).click();
		driver.findElement(By.xpath("//span[text()='4 GB']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='colorsprite aok-float-left'])[3]")).click();
		Thread.sleep(3000);
		
		
	}

}
