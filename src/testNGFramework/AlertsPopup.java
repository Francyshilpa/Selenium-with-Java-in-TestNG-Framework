package testNGFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertsPopup {
WebDriver driver;
@Test
   public void a_pageload()         {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
}
@Test
public void b_alertload() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'alert box')]")).click();
		Alert abc = driver.switchTo().alert();
		String AlertText = abc.getText();
		System.out.println(AlertText);
		Thread.sleep(3000);
		abc.accept();


}
}
