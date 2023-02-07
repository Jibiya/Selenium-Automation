package automationtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Isenabled {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		/*
		 * WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		 * if(searchBox.isDisplayed()) {
		 * System.out.println("Search box is visible. Return: "
		 * +searchBox.isDisplayed()); } else {
		 * System.out.println("Search box is not visible. Return: "
		 * +searchBox.isDisplayed()); } if(searchBox.isEnabled()) {
		 * System.out.println("Search box is visible. Return: " +searchBox.isEnabled());
		 * } else { System.out.println("Search box is not visible. Return: "
		 * +searchBox.isEnabled()); }
		 */
		/*
		 * WebElement we=driver.findElement(By.cssSelector("option[value='Yellow']"));
		 * 
		 * if(we.isEnabled()) {
		 * System.out.println("yellow checkbox is enabled. Return: " +we.isEnabled()); }
		 * we.click(); if(we.isSelected()) {
		 * System.out.println("yellow checkbox is selected. Return: " +we.isSelected());
		 * } else { System.out.println("yellow checkbox is not selected. Return: "
		 * +we.isSelected()); } if(we.isDisplayed()) {
		 * System.out.println("yellow checkbox is Displayed. Return: "
		 * +we.isDisplayed()); } else {
		 * System.out.println("yellow checkbox is not Displayed. Return: "
		 * +we.isDisplayed()); }
		 */
		//deselect
		 WebElement we1 = driver.findElement(By.id("multi-select-field"));
		 Select select = new Select(we1);
		 select.selectByVisibleText("Yellow");
		 Thread.sleep(3000);
		 select.deselectByVisibleText("Yellow");
		    } 
		
}

