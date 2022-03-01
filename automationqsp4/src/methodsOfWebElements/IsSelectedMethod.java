package methodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user/Downloads/checkboxes.html");
		Thread.sleep(5000);
		WebElement checkBoxOfAutomation = driver.findElement(By.id("i6"));
		checkBoxOfAutomation.click();
		boolean status = checkBoxOfAutomation.isSelected();
		System.out.println(status);


	}

}
