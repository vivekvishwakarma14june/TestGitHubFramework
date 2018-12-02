package selenimPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HoverAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Hello. Sign in']"));
		WebElement CreateaList = driver.findElement(By.xpath("//span[text()='Create a List']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(signIn).build().perform();
		WebDriverWait d = new WebDriverWait(driver,5);
		a.moveToElement(CreateaList).click().perform();
		
		
		
		
		// for click
		//a.moveToElement(signIn).click().perform();
		driver.close();
	}
	

}


