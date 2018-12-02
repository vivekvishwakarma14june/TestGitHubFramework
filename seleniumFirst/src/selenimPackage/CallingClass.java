package selenimPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallingClass {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		// driver.findElement(By.className("inputtext")).sendKeys("abc");
		driver.findElement(By.id("email")).sendKeys("abc");
		driver.findElement(By.id("pass")).sendKeys("123");
		driver.findElement(By.linkText("Forgotten account?")).click();
		//test
		driver.findElement(By.id("u_0_3")).click();
		// driver.navigate().to(arg0);
		// driver.navigate().refresh();
		// driver.navigate().back();
		// driver.navigate().forward();
		/*
		 * String s = driver.getTitle(); String s1 = "FlipKart";
		 * 
		 * 
		 * if (s1.contains(s1)) { System.out.println("true");
		 * 
		 * } else { System.out.println("false"); }
		 */

		// driver.close();

	}

}
