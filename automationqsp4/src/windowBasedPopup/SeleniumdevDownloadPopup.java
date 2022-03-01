package windowBasedPopup;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumdevDownloadPopup {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads");
		driver.findElement(By.linkText("4.1.2")).click();
		
		File fil = new File("./autoscripts/download1.exe");
		String abspath = fil.getAbsolutePath();
		Runtime.getRuntime().exec(abspath);
	}

}
