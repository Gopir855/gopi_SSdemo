package practice;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pg1 
{
	public static void main(String[] args) 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
		 WebElement ele = driver.findElement(By.id("day"));
		
		 Select sel = new Select(ele);
		 
		 sel.selectByVisibleText("4");		 
		 sel.selectByIndex(6);
		 sel.selectByValue("10");
		 
		 
		  WebElement ele2 = driver.findElement(By.id("month"));
		 Select sel2 = new Select(ele2);		
		 
		 sel2.selectByIndex(2);
		 sel2.selectByVisibleText("7");
		 
		
		 
				 
	}

}
