package com.b42.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestCalculator {

	public static void main(String[] args) throws MalformedURLException {
		
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "emulator-5554");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
	    desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	    desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
	    
	    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
	    
	    AndroidDriver<MobileElement> driver = new AndroidDriver(remoteUrl, desiredCapabilities); 
	    	    
	    MobileElement el1 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_2");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("plus");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_2");
	    el3.click();
	    
	    driver.quit();
	}
	
}

