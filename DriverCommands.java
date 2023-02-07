package automationtest;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverCommands {

public static void main(String[] args) {
// TODO Auto-generated method stub

WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://www.tutorialspoint.com");
String title=driver.getTitle();
System.out.println("Title is :"+ title);
String cururl=driver.getCurrentUrl();
System.out.println("current url is :"+ cururl);
String pagesource=driver.getPageSource();
System.out.println("page source is :"+ pagesource);
//driver.navigate().to("https://www.google.com");
driver.close();
driver.quit();
}

}

