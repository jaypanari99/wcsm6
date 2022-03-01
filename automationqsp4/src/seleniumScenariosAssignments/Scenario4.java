package seleniumScenariosAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("apple watch");
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		driver.findElement(By.xpath("//div[@id='x-refine__group__0']/descendant::li[@class='srp-refine__category__item']")).click();
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();



	}

}
