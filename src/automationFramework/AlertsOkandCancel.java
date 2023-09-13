package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsOkandCancel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'confirm box')")).click();
		Thread.sleep(1000);
		Alert abc = driver.switchTo().alert();
		String AlertText = abc.getText();
		System.out.println(AlertText);
		Thread.sleep(3000);
		abc.accept();
		

}
}
