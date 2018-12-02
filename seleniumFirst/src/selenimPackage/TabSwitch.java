package selenimPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TabSwitch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// use implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait d = new WebDriverWait(driver,60);
		driver.get("https://myaccount.google.com/intro?pli=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Privacy']")).click();
		System.out.println(System.getProperty("user.dir")); // use for project path
		Set <String> i = driver.getWindowHandles();
		Iterator<String> x= i.iterator();
		
		String parent = x.next();
		String child = x.next();
		
		driver.switchTo().window(child);
		
		
		
	}

}
