package firstPresentation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String title =driver.getTitle();
		System.out.println(title);               
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String source= driver.getPageSource();
		System.out.println(source);
		driver.switchTo().activeElement().sendKeys("abc",Keys.ENTER);
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
	}

}
