package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOn10WebElementCase1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=eacon0rb6tid");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='item']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='usersSelector.selectedUser']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='item']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='item']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='username']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		Thread.sleep(2000);
		
	}

}
