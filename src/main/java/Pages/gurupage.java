package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basetest.basetest;

public class gurupage extends basetest {
	
	@FindBy(name="btnReset")
	public WebElement reset;
	
	
	public gurupage()
	{
		PageFactory.initElements(driver,this);
	}

	public void gettext()
	{
		reset.getText();
	}
	
	
}
