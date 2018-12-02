package selenimPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(
				"vivek");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(
				"vishwakarma");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(
				"vivekkumar@mailinator.com");
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//input[@name='reg_email_confirmation__']"))
				.sendKeys("vivekkumar@mailinator.com");

		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(
				"vishwakarma@1234");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
*/
	String s = driver.findElement(By.xpath("//p[contains(text(),'By clicking Sign Up, you agree to our ')]")).getText();
		System.out.println(s);
		
		
	}
}
