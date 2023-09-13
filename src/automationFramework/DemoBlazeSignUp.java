package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoBlazeSignUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sign-username")).sendKeys("raj");
		driver.findElement(By.id("sign-password")).sendKeys("raj@123");
		driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
		Thread.sleep(2000);
		Alert abc = driver.switchTo().alert();
		abc.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Send message')]/following::span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("recipient-email")).sendKeys("raj@gmail.com");
		driver.findElement(By.id("recipient-name")).sendKeys("raj");
		driver.findElement(By.id("message-text")).sendKeys("serenity");
		driver.findElement(By.xpath("//button[contains(text(),'Send message')]")).click();
		Thread.sleep(2000);
		Alert abcd = driver.switchTo().alert();
		abcd.accept();
		Actions ab = new Actions(driver);
		ab.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		WebElement ProductLink = driver.findElement(By.xpath("//a[contains(text(),'1520')]"));
		ProductLink.click();
		//Actions abcde = new Actions(driver);
		//abcde.doubleClick(doubleClickButton).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.accept();




}
}
