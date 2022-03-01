package keywordDrivenFramework;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;

import dataDrivenFramework.Flib;

public class ActiTimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
    BaseTest bt = new BaseTest();
    bt.openBrowser();
    
    Flib flib = new Flib();
    int rc = flib.getRowCount("./data/TestData.xlsx","invalidcreds");
    
    for (int i=1;i<=rc;i++)
    {
    	String username=flib.readExcelData("./data/TestData.xlsx","invalidcreds",i,0);
		driver.findElement(By.name("username")).sendKeys(username);
		String password = flib.readExcelData("./data/TestData.xlsx", "invalidcreds", i, 1);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(4000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("username")).clear();
    }
    
    
	}

}
