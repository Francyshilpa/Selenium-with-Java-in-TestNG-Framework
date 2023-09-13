package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPrompt {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'prompt box')]")).click();
		Thread.sleep(1000);
		Alert abc = driver.switchTo().alert();
		String PromptText = abc.getText();
		System.out.println(PromptText);
		abc.sendKeys("jane");
		abc.accept();
		String OutputText = driver.findElement(By.xpath("//button[contains(text(),'prompt box')]")).getText();
		System.out.println(OutputText);

	}
}
