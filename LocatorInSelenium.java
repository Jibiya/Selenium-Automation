package automationtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		//driver.navigate().to("https://www.access.service.gov.uk/login/signin/creds");
		//driver.navigate().to("https://www.saucedemo.com/");
		//driver.findElement(By.id("user-name")).click();
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).click();
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.name("login-button")).click();
		//driver.findElement(By.id("react-burger-menu-btn")).click();
		//driver.findElement(By.linkText("Courses")).click();
		//driver.findElement(By.linkText("Learning Paths")).click();
		//driver.findElement(By.tagName("button")).click();
		//cssSelector
		driver.findElement(By.cssSelector("button[id='button-two']")).click();
		//xpath
		driver.findElement(By.xpath("//input[@id='single-input-field']")).sendKeys("Hello");
	}

}
