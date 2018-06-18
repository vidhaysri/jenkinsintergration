package testcases;

import org.testng.annotations.*;

import Pages.gurupage;
import basetest.basetest;

public class guruclass extends basetest {
	gurupage guru;
	
	public guruclass()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		intialise();
		
		guru= new gurupage();
	}
	
	@Test
	public void test()
	{
		guru.reset.click();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		
	}

}
