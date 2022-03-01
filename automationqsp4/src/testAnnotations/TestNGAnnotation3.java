package testAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotation3 {
	@Test
	public void testScript1() 
	{
		Reporter.log("test script ",true);
	}
	@BeforeMethod
	public void beforeMethod() 
	{
		Reporter.log("before method ",true);
	}

	@AfterMethod
	public void afterMethod() 
	{
		Reporter.log("after method ",true);
	}

	@BeforeClass
	public void beforeClass() 
	{
		Reporter.log("before class ",true);
	}

	@AfterClass
	public void afterClass() 
	{
		Reporter.log("after class ",true);
	}

	@BeforeTest
	public void beforeTest() 
	{
		Reporter.log("before test ",true);
	}

	@AfterTest
	public void afterTest() 
	{
		Reporter.log("after test ",true);
	}

	@BeforeSuite
	public void beforeSuite() 
	{
		Reporter.log("before suite" ,true);
	}
	
	@Test
	public void testScript2() 
	{
		Reporter.log("test script 2",true);
	}

	@AfterSuite
	public void afterSuite() 
	{
		Reporter.log("after suite ",true);
	}
//	before suite
//	before test 
//	before class 
//	before method 
//	test script 
//	after method 
//	before method 
//	test script 2
//	after method 
//	after class 
//	after test 
// after suite
}
