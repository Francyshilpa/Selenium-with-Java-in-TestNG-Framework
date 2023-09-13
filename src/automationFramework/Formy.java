package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
        driver.findElement(By.id("first-name")).sendKeys("sharmi");
        driver.findElement(By.id("last-name")).sendKeys("jane");
        driver.findElement(By.id("job-title")).sendKeys("test engineer");
        //driver.findElement(By.id("radio-button-2")).click();
        WebElement CollegeRadioButton = driver.findElement(By.id("radio-button-2"));
        CollegeRadioButton.click();
        //driver.findElement(By.id("checkbox-3")).click();
        WebElement Gender = driver.findElement(By.id("checkbox-3"));
        Gender.click();
        Select experience = new Select(driver.findElement(By.id("select-menu")));
        experience.selectByVisibleText("5-9");
        //experience.selectByIndex(3);
        //experience.selectByValue("3");
        driver.findElement(By.id("datepicker")).sendKeys("09/28/1998");
        driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
 }
}