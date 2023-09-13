package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JPetStore {
	
WebDriver driver;
@Test(priority=1)
public void pageLoad() {
		System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.manage().window().maximize();
}
@Test(priority=2)
public void userInfo() {
		driver.findElement(By.name("username")).sendKeys("vimala");
		driver.findElement(By.name("password")).sendKeys("Raj@123");
		driver.findElement(By.name("repeatedPassword")).sendKeys("Raj@123");
}
@Test(priority=3)
public void accountInfo() throws InterruptedException {
		driver.findElement(By.name("account.firstName")).sendKeys("sharmi");
		driver.findElement(By.name("account.lastName")).sendKeys("jane");
		driver.findElement(By.name("account.email")).sendKeys("sharmi@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("9876543210");
		driver.findElement(By.name("account.address1")).sendKeys("qspiders");
		driver.findElement(By.name("account.address2")).sendKeys("velachery");
		driver.findElement(By.name("account.city")).sendKeys("chennai");
		driver.findElement(By.name("account.state")).sendKeys("tamilnadu");
		driver.findElement(By.name("account.zip")).sendKeys("600007");
		driver.findElement(By.name("account.country")).sendKeys("INDIA");
		Thread.sleep(3000);
}
@Test(priority=4)
public void profileInfo() {
		Select languagepreference = new Select(driver.findElement(By.name("account.languagePreference")));
		languagepreference.selectByVisibleText("english");
		Select favouritecategory = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
		favouritecategory.selectByVisibleText("DOGS");
		WebElement mylist = driver.findElement(By.name("account.listOption"));
		mylist.click();
		WebElement mybanner = driver.findElement(By.name("account.bannerOption"));
		mybanner.click();
		driver.findElement(By.xpath("//input[@name='newAccount']")).click();


}

}
