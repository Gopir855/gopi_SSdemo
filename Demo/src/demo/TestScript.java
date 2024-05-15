package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.Amazon.com");
	
	WebElement el = driver.findElement(By.xpath("//a[text()='Sell on Amazon Business']"));
	Thread.sleep(2000);
	JavascriptExecutor a = (JavascriptExecutor)driver;
	a.executeScript("arguments[0].scrollIntoView();",el);
	Thread.sleep(5000);
	a.executeScript("arguments[0].click()",el);
	//a.executeScript()
}
}
