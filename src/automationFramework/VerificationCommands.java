package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationCommands {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		WebElement CollegeRadioButton = driver.findElement(By.id("radio-button-2"));
		CollegeRadioButton.click();
		System.out.println(CollegeRadioButton.isSelected());
		WebElement Gender = driver.findElement(By.id("checkbox-3"));
		Gender.click();
		System.out.println(Gender.isSelected());
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Complete')]")).isDisplayed());
		

}
}
