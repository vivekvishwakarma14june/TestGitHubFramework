package selenimPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindLinks {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Home\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	
	driver.get("https://www.cdnsol.com/");
	driver.manage().window().maximize();
	
	// Find list of size webelements
	/*int size = driver.findElements(By.xpath("//a")).size();
	System.out.println(size);
	*/
	int size = driver.findElement(By.xpath("//footer")).findElements(By.xpath("//a")).size();
	System.out.println("Footer Links" +  size);
	
	
	
}
}
