package automationtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("https://www.obsqurazone.com/");
		driver.navigate().to("https://www.browserstack.com/");
		// Locating the element 
		//WebElement we = driver.findElement(By.id("signupModalButton"));
		WebElement we = driver.findElement(By.partialLinkText("View"));
		//String attValue = element.getAttribute("id");
		//using getText method the retrieve the text of the element
		System.out.println("get text element is :" +we.getText());
		//getTagName()
		System.out.println("get Tagname element is :" +we.getTagName());
		
		
		System.out.println(" css value is :"+ driver.findElement(By.id("custom-fc-frame")).getCssValue("font-size"));
		//getsize//getAttribute()
		System.out.println("get Attribute element is :" +driver.findElement(By.id("custom-fc-frame")).getAttribute("id"));
		//getCssValue
		System.out.println(" getsize value is :"+ driver.findElement(By.id("view-all-testimonials")).getSize());
		//getlocation
		System.out.println(" getlocation value is :"+ driver.findElement(By.id("view-all-testimonials")).getLocation());
		List<WebElement> e= driver.findElements(By.cssSelector("div[class='product-cards-wrapper--click']"));
		System.out.println("no of blocks:" +e.size());
		for(WebElement i:e)
		{
			System.out.println(i);
		}

	}
}
