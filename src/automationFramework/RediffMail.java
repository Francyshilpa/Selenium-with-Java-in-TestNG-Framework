package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffMail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[1]")).sendKeys("Amirtha");
		driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[2]")).sendKeys("amirtha1kilo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Check availability']")).click();
		driver.findElement(By.id("newpasswd")).sendKeys("Raj@12345");
		driver.findElement(By.id("newpasswd1")).sendKeys("Raj@12345");
		driver.findElement(By.xpath("//td[contains(text(),'Alternate Email Address')]/following::input[1]")).sendKeys("hope123@gmail.com");
		driver.findElement(By.id("mobno")).sendKeys("9182736450");
		Select Day = new Select (driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[1]")));
		Day.selectByVisibleText("28");
		Select Month = new Select (driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[2]")));
		Month.selectByVisibleText("SEP");
		Select Year = new Select (driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[3]")));
		Year.selectByVisibleText("1998");
	    WebElement Gender = driver.findElement(By.xpath("//input[@value='f']"));
	    Gender.click();
	    Select country = new Select (driver.findElement(By.id("country")));
		country.selectByVisibleText("India");
		Select city = new Select (driver.findElement(By.xpath("//td[contains(text(),'City')]/following::select")));
		city.selectByVisibleText("Chennai");
		Thread.sleep(15000);
		driver.findElement(By.id("Register")).click();		

}
}
