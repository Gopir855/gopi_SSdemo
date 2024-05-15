package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.shoppersstack.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.findElement(By.xpath("//button[text()='Login']")).click();
	    driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("fvgdsf");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("dgsf");
		 WebElement ele = driver.findElement(By.xpath("//span[text()='Login']"));
		
		 
		 Actions act = new Actions(driver);
		 act.moveToElement(ele).click().perform();
		 
		act.contextClick(ele).perform();
		
		act.dragAndDrop(ele, ele).perform();
		
		act.doubleClick(ele);
	}
}
