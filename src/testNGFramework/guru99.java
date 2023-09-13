package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class guru99 {
	WebDriver driver;
	@Test
	public void a_pageload()  {
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
	}
	@Test
	public void b_nameinfo() {
		driver.findElement(By.name("firstName")).sendKeys("Amirtha");
		driver.findElement(By.name("lastName")).sendKeys("Raj");
		driver.findElement(By.name("phone")).sendKeys("9876543210");
		driver.findElement(By.id("userName")).sendKeys("amirtharaj@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("velachery");
	}
	@Test
	public void c_address() {
		driver.findElement(By.name("city")).sendKeys("chennai");
		driver.findElement(By.name("state")).sendKeys("tamilnadu");
		driver.findElement(By.name("postalCode")).sendKeys("600007");
		driver.findElement(By.xpath("//option[@value='INDIA']")).click();
	}
		//Select country = new Select (driver.findElement(By.name("country")));
		//country.selectByVisibleText("INDIA");
	@Test
	public void d_submitinfo() {
		driver.findElement(By.id("email")).sendKeys("AmirthaRaj");
		driver.findElement(By.name("password")).sendKeys("Raj@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("Raj@123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
	}
}
