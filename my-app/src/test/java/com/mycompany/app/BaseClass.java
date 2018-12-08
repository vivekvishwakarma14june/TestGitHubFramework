package com.mycompany.app;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import SupportLibrary.PropertiesReadTest;

public class BaseClass {
	Properties p = PropertiesReadTest.PropertyRead();

	public void sample() {
		p.getProperty("URL");
		p.getProperty("BrowserName");
	}

	public WebDriver driver;

	@BeforeSuite
	public void toInvokeBrowser() {
		//p.getProperty("URL");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(p.getProperty("URL"));
		driver.manage().window().maximize();
	}

}
