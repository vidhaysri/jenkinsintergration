package basetest;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


import testutil.webeventlistener;

public class basetest {
	
	public static WebDriver dr;
	public static EventFiringWebDriver driver;
	public static webeventlistener eventlistener;
	public static Properties prop;
	EventFiringWebDriver efwd ;
	
	
	public basetest()

	{
		try {
			FileInputStream file = new FileInputStream(
					"D:\\Selenium scripts\\newmavenproject\\src\\main\\java\\Configuration\\config.properties");
			prop =new Properties();
			prop.load(file);

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public void intialise()
	{
		System.setProperty("webdriver.gecko.driver","D:\\driver\\geckodriver.exe");
		
		dr=new FirefoxDriver();
		driver= new EventFiringWebDriver(dr);
		driver.register(eventlistener);	
		System.out.println("inside");
		driver.get("http://www.demo.guru99.com/V4/index.php");
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		driver.findElement(By.name("uid")).sendKeys(prop.getProperty("username"));
		System.out.println("inisde thread1");	
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.name("btnLogin")).click();
	}
	
	
	public void close()
	{
		driver.quit();
	}
	
	
	
	
}
