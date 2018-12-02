package selenimPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lifestylestores.com/in/en/department/men");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(
				"jeans");
		driver.findElement(By.xpath("//input[@name='firstname']")).click();
}
}
