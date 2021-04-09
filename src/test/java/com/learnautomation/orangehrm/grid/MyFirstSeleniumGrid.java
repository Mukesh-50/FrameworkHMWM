package com.learnautomation.orangehrm.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class MyFirstSeleniumGrid {
	
	
	@Test
	public void testOnBrowserStack() throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities caps=new DesiredCapabilities();
		
		caps.setCapability("os_version", "14");

		caps.setCapability("device", "iPhone 12 Pro Max");

		caps.setCapability("real_mobile", "true");
		
		String hubURL="https://mukeshotwani3:s4GTbs4fFzQxJxzpzp2f@hub-cloud.browserstack.com/wd/hub";
		
		URL url=new URL(hubURL);
		
		WebDriver driver=new RemoteWebDriver(url, caps);
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium Test Automation");
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		/*
		 * 
		 *   http://www.usa.com
		 *   http://username:password@www.usa.com
		 * 
		 */
	}
	

}
