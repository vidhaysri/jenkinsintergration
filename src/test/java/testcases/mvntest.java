package testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class mvntest {

		
		@Test
		public void test() throws MalformedURLException
		{
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setBrowserName("firefox");
			System.setProperty("webdriver.gecko.driver","D:\\driver\\geckodriver.exe");
			WebDriver d= new RemoteWebDriver(new URL ("http://192.168.0.17:5555"),capabilities);
			SoftAssert softassert= new SoftAssert();
			softassert.assertTrue(false);
			System.out.println("hellow wearehappy");
			softassert.assertAll();
		}

	}



