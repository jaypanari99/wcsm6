package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnLeaveAMessageOnBluestone22Jan {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/jewellery/filter/20+percentage+off.html");
		Thread.sleep(6000);
		//driver.findElement(By.xpath("//p[.='Leave a message']")).click(); no such element exception
		
		driver.findElement(By.xpath("//span[.='Your name:']")).sendKeys("abcd");

	}

}
