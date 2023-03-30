package TestSuite1;

import java.io.ObjectInput;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class module1 {
	@BeforeGroups(groups= {"sanity"})
	
	public void beforegroup() {
		System.out.println("I am executing test case before group");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("I am executing test cases before suite");
	}
	@BeforeTest
		public void beforetest() {
		System.out.println("I am executing test case before test");
	}
	@BeforeClass
	  public void beforeclass() {

		System.out.println("I am executing test case before class");
	}
	@BeforeMethod
	public void beformethod() {
		System.out.println("I am executing  test case before method ");
	}
	@Test
	public void testcase001() {
		System.out.println("I am executing test case 001");
	}
	@Test
	public void testcase002() {
		System.out.println("I am executing test case 002");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("I am executing test case after test");
	}
	@Test
	public void testcase003() {
		System.out.println("I am executing test case 003");
	}
	@Test (groups={"Sanity"})
	public void test() {
		
		System.out.println("I am executing test cases004");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("I am executing test case after method");
		
	}
	@AfterClass
	public void afterclass() {
		System.out.println("I am executing test cases after class");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("I am executing test cases after suites");
		
	}
	@AfterGroups(groups= {"Sanity"})
	public void aftergroup() {
		System.out.println("I am executing test case for Sanity Group");
	}
	@DataProvider
	public Object[][] dataforlogin()
	{
		Object[][] data= {{"username","Password"},{"username","Password"}};	
		return data;
	}
		@Test(dataProvider="dataforlogin")
		public void login(String username,String password)
		{
			System.out.println("Username:"+username);
			System.out.println("Password:"+password);
		}
	     
	
	
}
	

	

