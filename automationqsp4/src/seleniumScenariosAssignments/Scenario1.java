package seleniumScenariosAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("(//div[@class='Xb9hP']/ancestor::div[@id='view_container']/descendant::input[@class='whsOnd zhqkbf'])[1]")).sendKeys("jaipanari57@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();

	}

}
