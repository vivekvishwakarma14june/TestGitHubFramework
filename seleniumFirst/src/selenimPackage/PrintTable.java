package selenimPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		int columnCount = driver.findElements(
				By.xpath("//table[@id='customers']/tbody/tr/th")).size();
		System.out.println("Number Of Column = " + columnCount);
		int rowCount = driver.findElements(
				By.xpath("//table[@id='customers']/tbody/tr")).size();
		System.out.println("Number Of Rows = " + rowCount);

		/*
		 * String cellXPath = "//table[@id='customers']//tr";
		 * 
		 * By cellByXPath = By.xpath(cellXPath);
		 * 
		 * WebElement cellElement = driver.findElement(cellByXPath);
		 * 
		 * String text = cellElement.getText();
		 * 
		 * System.out.println(text);
		 */

		for (int i = 2; i <= rowCount; i++) {

			for (int j = 1; j <= columnCount; j++) {

				System.out.println(driver.findElement(
						By.xpath("//table[@id='customers']/tbody/tr[" + i
								+ "]/td[" + j + "]")).getText());

			}

		}

		/*
		 * for(int numberOfRows=1; numberOfRows<=18; numberOfRows++) { for(int
		 * numberOfCol=1; numberOfCol <=3; numberOfCol++) { //
		 * System.out.println
		 * (driver.findElements(By.xpath("//table[@id='customers']//tr//td")));
		 * } }
		 */
		driver.close();
	}
}
