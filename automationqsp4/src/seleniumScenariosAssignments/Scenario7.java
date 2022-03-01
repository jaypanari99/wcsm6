package seleniumScenariosAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import methodsOfWebDriver.WebElement;

public class Scenario7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.Bluestone.com/");
		
		WebElement target = (WebElement) driver.findElement(By.xpath("//a[.='All Jewellery ']"));
		Actions act = new Actions(driver);
		act.moveToElement((org.openqa.selenium.WebElement) target).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[.='Kadas']")).click();
		driver.findElement(By.xpath("(//a[@id='pid_5675'])[2]")).click();
		driver.findElement(By.xpath("//div[@class='col-xs-11']/descendant::input[@id='buy-now']")).click();
		driver.close();
	}

}
