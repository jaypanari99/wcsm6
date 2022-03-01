package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='val']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='i24fI']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='-MzZI']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='gr27e  ']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='_9nyy2']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_8iep _8icy _9ahz _9ah-']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='reg_pages_msg']"));
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ title='Search for products, brands and more']")).sendKeys("Laptop"); 
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("path[class*='_34RNph']")).click();  
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Core i5']")).click();    
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@title='HP']]")).click();   
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='Operating System']")).click();   
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='Windows 10']")).click();   
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@title='4★ & above']")).click();
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("jay");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("panari");
		driver.findElement(By.xpath("//input[@id='employeeId']")).clear();
		driver.findElement(By.xpath("//input[@id='employeeId']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	    
	   
	}

}
