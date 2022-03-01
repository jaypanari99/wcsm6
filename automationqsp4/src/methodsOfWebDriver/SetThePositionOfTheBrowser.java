package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetThePositionOfTheBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Point targetPosition = new Point(300,700);
		driver.manage().window().setPosition(targetPosition);
		driver.get("https://www.google.com");
	}

}
