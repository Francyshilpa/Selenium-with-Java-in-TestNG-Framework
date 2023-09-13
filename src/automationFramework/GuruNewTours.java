package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GuruNewTours {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		driver.findElement(By.xpath("//a[contains(text(),'New Tours')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		driver.manage().window().maximize();
		driver.findElement(By.name("firstName")).sendKeys("Amirtha");
		driver.findElement(By.name("lastName")).sendKeys("Raj");
		driver.findElement(By.name("phone")).sendKeys("9876543210");
		driver.findElement(By.id("userName")).sendKeys("amirtharaj@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("velachery");
		driver.findElement(By.name("city")).sendKeys("chennai");
		driver.findElement(By.name("state")).sendKeys("tamilnadu");
		driver.findElement(By.name("postalCode")).sendKeys("600007");
		//driver.findElement(By.xpath("//option[@value='INDIA']")).click();
		Select country = new Select (driver.findElement(By.name("country")));
		country.selectByVisibleText("INDIA");
		driver.findElement(By.id("email")).sendKeys("AmirthaRaj");
		driver.findElement(By.name("password")).sendKeys("Raj@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("Raj@123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();

}
}