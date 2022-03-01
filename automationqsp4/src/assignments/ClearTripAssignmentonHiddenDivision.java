package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripAssignmentonHiddenDivision {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/?&utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab|Main_E|cleartrip|e&dxid=Cj0KCQiAi9mPBhCJARIsAHchl1yHWXoj9ASo1airURgXx2l5DmakjJmEBafq_wSPa3egzo8F_VU58r8aAhNKEALw_wcB&gclid=Cj0KCQiAi9mPBhCJARIsAHchl1yHWXoj9ASo1airURgXx2l5DmakjJmEBafq_wSPa3egzo8F_VU58r8aAhNKEALw_wcB");
		
	}

}
