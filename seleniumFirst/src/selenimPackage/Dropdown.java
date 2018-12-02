package selenimPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(
				By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_2']"))
				.click();

		driver.findElement(By.xpath("//a[@id='MultiCityModelAlert']")).click();

		driver.findElement(
				By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@text,'Leh')]")).click();
		driver.findElement(
				By.xpath("//span[@id='ctl00_mainContent_ddl_destinationStation1_CTXTaction']"))
				.click();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(@text,'Mumbai')]"))
				.click();
	}

}

// //a[contains(@text,'Leh')] and //a[contains(@text,'Mumbai')]