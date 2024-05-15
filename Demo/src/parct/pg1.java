package parct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("wger");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("hdcdsh");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("gvsdf");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rgaer");
		Thread.sleep(2000);	
		
		//select class 
		WebElement ele = driver.findElement(By.tagName("Select"));
		Select sel = new Select(ele);
		sel.selectByIndex(1);
		Thread.sleep(2000);	
		sel.deselectByIndex(1);
		Thread.sleep(2000);	
		sel.selectByValue("4");
		Thread.sleep(2000);	
		sel.selectByVisibleText("10");
		Thread.sleep(2000);	
		
		//select class
		WebElement ele1 = driver.findElement(By.tagName("select"));
		 Select sel1 = new Select(ele1);
		 sel1.selectByValue("");
		 Thread.sleep(2000);
		
		
		driver.close();
	}

}
