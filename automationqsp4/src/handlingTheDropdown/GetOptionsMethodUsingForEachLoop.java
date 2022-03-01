package handlingTheDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethodUsingForEachLoop {
	
	public static void main(String[] args){
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/user/Desktop/Dropdown/SingleSelectDropdown.html");
	WebElement element = driver.findElement(By.id("menu"));
	Select sel = new Select(element);
	List<WebElement> optionsOfDropdown = sel.getOptions();
	
	for(WebElement option:optionsOfDropdown)
	{
		String textOfTheOption = option.getText();
		System.out.println(textOfTheOption);
	}

}
}
