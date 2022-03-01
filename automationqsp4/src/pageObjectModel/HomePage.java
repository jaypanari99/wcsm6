package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//declaration
	
	@FindBy(xpath="//a[.='Logout']") private WebElement logoutLink;
	@FindBy(name="usersSelector.selectedUser") private WebElement enterTimeTrackDropdown;
	@FindBy(id="SubmitTTButton") private WebElement saveLeaveTimeButton;
	
	
	
	
	//utilization
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public WebElement getEnterTimeTrackDropdown() {
		return enterTimeTrackDropdown;
	}
	public WebElement getSaveLeaveTimeButton() {
		return saveLeaveTimeButton;
	}
	// utilization is to generate geters --> go to source---> generate geters and seters---> select on geters option i.e first option deselect send option i.e seters
	
	
	
	//initialization
     public HomePage(WebDriver driver) 
     {
    	 PageFactory.initElements(driver, this);
		
	 }
	// initialization is to generate constructors go to source---> generate constructors using fields---> deselect all the options and click on generate 
     
     
     
     
     
     //generic reusable method
     
     public void logout()
     {
    	 logoutLink.click();
     }
	

}
