package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CSSSelectorsDemo {
	WebDriver driver;
	@Test 
	public void a_Page_Load () {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("signin_button")).click();
		//driver.findElement(By.cssSelector("signin_button")).click();
		//driver.findElement(By.ClassName("signin btn btn-info")).click();
		driver.findElement(By.cssSelector(".signin btn btn-info")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();
		//driver.findElement(By.LinkText("Forgot your password ?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
	

}
}
