package selenimPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Use Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Use Explicit wait
		WebDriverWait d = new WebDriverWait(driver,60);
		// Use multiple condition according to application behaviour
		d.until(ExpectedConditions.alertIsPresent());
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

}
}
