package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void a() {
	  
	//System.out.println("hi"); only gives console output and not reports   
		//Reporter.log("hi");  only gives reports and not console output
		//Reporter.log("hi",true); gives both reports and console output

		//emailable-report.html and index.html to see the output of the generated reports--->open with ----> web browser  in the test- output package 
		  
		// to install testNG ----> go to help----> install new software and in Work with type https://testng.org/testng-eclipse-update-site
		// and hit on enter button and click on next
	  
	  Reporter.log("from Demo",true);
	  
	  
  }
}
