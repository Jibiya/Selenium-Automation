package automationtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		/*
		 * driver.get("https://selenium.obsqurazone.com/check-box-demo.php"); WebElement
		 * we1 = driver.findElement(By.id("gridCheck")); we1.click();
		 */
		driver.get("https://selenium.obsqurazone.com/select-input.php"); 
		//select for static dropdown
		WebElement seldrp = driver.findElement(By.id("single-input-field"));
		seldrp.click();
		Thread.sleep(3000);
		Select sel=new Select(seldrp);
		sel.selectByVisibleText("Red");
		sel.selectByValue("Green");
		Thread.sleep(3000);
		sel.selectByIndex(1);
		}
}
