package bluestone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/user/Downloads/LoginPage.html");
		
		driver.findElement(By.id("un")).sendKeys("suraj");
		WebElement frameElement = driver.findElement(By.id("frid"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("pwd")).sendKeys("sawant");

	}

}
