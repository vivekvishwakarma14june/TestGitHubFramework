package selenimPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		// By frame index
		//driver.switchTo().frame(0);
	
		
		// By frame webelement xpath
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();
		
		//driver.findElement(By.xpath(xpathExpression))
		
	}

}
