package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeAssignment3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=eacon0rb6tid");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Users")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abcder");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("abcde");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("abcde");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("xyz");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("xyz");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
		Thread.sleep(1000);
	}

}
