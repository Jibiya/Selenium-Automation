package automationtest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement we1 = driver.findElement(By.id("inlineRadio1"));
		we1.click();
		System.out.println(we1.isSelected());
		//driver.close();
		//driver.quit();
		}
}
