package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDragandDrop {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement Element1 = driver.findElement(By.id("draggable"));
		WebElement Element2 = driver.findElement(By.id("droppable"));
		Actions abc = new Actions(driver);
		abc.dragAndDrop(Element1,Element2).build().perform();
		
		

}
}
