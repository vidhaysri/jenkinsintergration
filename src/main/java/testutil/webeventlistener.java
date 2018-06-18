package testutil;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import basetest.basetest;

public class webeventlistener extends basetest implements WebDriverEventListener {

	public void beforeNavigateTo(String url, WebDriver dr) {
		System.out.println("Before navigating to: '" + url + "'");
	}

	public void afterNavigateTo(String url, WebDriver dr) {
		System.out.println("Navigated to:'" + url + "'");
	}

	public void beforeChangeValueOf(WebElement element, WebDriver dr) {
		System.out.println("Value of the:" + element.toString() + " before any changes made");
	}

	public void afterChangeValueOf(WebElement element, WebDriver dr) {
		System.out.println("Element value changed to: " + element.toString());
	}

	public void beforeClickOn(WebElement element, WebDriver dr) {
		System.out.println("Trying to click on: " + element.toString());
	}

	public void afterClickOn(WebElement element, WebDriver dr) {
		System.out.println("Clicked on: " + element.toString());
	}

	public void beforeNavigateBack(WebDriver dr) {
		System.out.println("Navigating back to previous page");
	}

	public void afterNavigateBack(WebDriver dr) {
		System.out.println("Navigated back to previous page");
	}

	public void beforeNavigateForward(WebDriver dr) {
		System.out.println("Navigating forward to next page");
	}

	public void afterNavigateForward(WebDriver dr) {
		System.out.println("Navigated forward to next page");
	}

	public void onException(Throwable error, WebDriver dr) {
		System.out.println("Exception occured: " + error);
		try {
			tesutil.takeScreenshotAtEndOfTest();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void beforeFindBy(By by, WebElement element, WebDriver dr) {
		System.out.println("Trying to find Element By : " + by.toString());
	}

	public void afterFindBy(By by, WebElement element, WebDriver dr) {
		System.out.println("Found Element By : " + by.toString());
	}

	/*
	 * non overridden methods of WebListener class
	 */
	public void beforeScript(String script, WebDriver dr) {
	}

	public void afterScript(String script, WebDriver dr) {
	}

	public void beforeAlertAccept(WebDriver dr) {
		// TODO Auto-generated method stub

	}

	public void afterAlertAccept(WebDriver dr) {
		// TODO Auto-generated method stub

	}

	public void afterAlertDismiss(WebDriver dr) {
		// TODO Auto-generated method stub

	}

	public void beforeAlertDismiss(WebDriver dr) {
		// TODO Auto-generated method stub

	}

	public void beforeNavigateRefresh(WebDriver dr) {
		// TODO Auto-generated method stub

	}

	public void afterNavigateRefresh(WebDriver dr) {
		// TODO Auto-generated method stub

	}

	public void beforeChangeValueOf(WebElement element, WebDriver dr, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub

	}

	public void afterChangeValueOf(WebElement element, WebDriver dr, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub

	}

	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

}