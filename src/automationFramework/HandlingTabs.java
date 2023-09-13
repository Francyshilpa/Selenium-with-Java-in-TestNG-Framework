package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[contains(text(),'Services')]")).click();
		Thread.sleep(5000);
		ArrayList <String> NaukriTabs = new ArrayList <String> (driver.getWindowHandles());
		for(String WindowHandleValues:NaukriTabs) {
			System.out.println(WindowHandleValues);
			
		}
		driver.switchTo().window(NaukriTabs.get(1));
		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
		String PageURL = driver.getCurrentUrl();
		System.out.println(PageURL);
}
	
}
