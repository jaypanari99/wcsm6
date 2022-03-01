package handlingTheDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleTextMethod {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/user/Desktop/Dropdown/SingleSelectDropdown.html");
	WebElement element = driver.findElement(By.id("menu"));
	Select sel = new Select(element);
	sel.selectByVisibleText("Shira");
		
	}

}
