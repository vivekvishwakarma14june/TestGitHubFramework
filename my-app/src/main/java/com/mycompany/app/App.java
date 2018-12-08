package com.mycompany.app;
import java.io.File;



import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
public static String capture(WebDriver driver, String screenshotName, String ResultFolderPath) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String FileName = screenshotName + ".jpg";
		String dest = ResultFolderPath + "\\" + screenshotName + ".jpg";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
		return FileName;
	}
    
    
}
