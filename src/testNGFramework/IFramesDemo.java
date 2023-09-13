package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFramesDemo  {

	WebDriver driver;
	@Test 
	public void a_Page_Load () {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://nunzioweb.com/index.shtml");
		driver.manage().window().maximize();
		driver.switchTo().frame("oddcouple");
		String SampleText = driver.findElement(By.xpath("//div[starts-with(text(),'A television')]")).getText();
		System.out.println(SampleText);
	}
}
