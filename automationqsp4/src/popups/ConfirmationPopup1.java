package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/user/Desktop/Popups/Confirmation.html");
		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		
		Alert al = driver.switchTo().alert();
		String textOfTheAlertPopup = al.getText();
		System.out.println(textOfTheAlertPopup);
		al.accept();
	}

}
