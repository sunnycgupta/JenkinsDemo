package com.bunny;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.sunny.Practice_1;

public class SeleniumPractice extends Practice_1{
	@Test()
	public void dragon() {
	
		
		//System.setProperty("webdriver.chrome.driver","C:\\Sunny\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver","C:\\Program Files (x86)\\Microsoft Web Driver\\MicrosoftWebDriver.exe");
		// WebDriver driver = new ChromeDriver();
		// gulu wrote a code
		WebDriver driver = new EdgeDriver();

	       driver.get("http://www.facebook.com");

	       System.out.println("Application title is ============="+driver.getTitle());

	       driver.quit();
	}

}
