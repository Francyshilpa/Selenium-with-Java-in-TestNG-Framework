package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja {
	
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-firstname")).sendKeys("sharmi");
		driver.findElement(By.id("input-lastname")).sendKeys("jane");
		driver.findElement(By.id("input-email")).sendKeys("abc123@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
		driver.findElement(By.id("input-password")).sendKeys("Raj@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Raj@123");
	    WebElement NewsletterRadioButton = driver.findElement(By.xpath("//label[contains(text(),'Subscribe')]/following::input[1]"));
	    NewsletterRadioButton.click();
	    WebElement PrivacyPolicy = driver.findElement(By.name("agree"));
	    PrivacyPolicy.click();
	    driver.findElement(By.xpath("//input[@value='Continue']")).click();

	    

}
}