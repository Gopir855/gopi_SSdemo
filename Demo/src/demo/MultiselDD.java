package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselDD 
{
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
      WebDriver driver= new ChromeDriver();
      driver.get("https://demoqa.com/select-menu");
      Thread.sleep(2000);
      driver.manage().window().maximize();
      
    //  driver.findElement(By.xpath("//input[@id='react-select-2-input']")).click();
      
      
      
      //Example for jse
      WebElement g = driver.findElement(By.xpath("//select[@id='cars']"));
      
    Thread.sleep(2000);
  	JavascriptExecutor p = (JavascriptExecutor)driver;
  	p.executeScript("arguments[0].scrollIntoView();",g);
  	Thread.sleep(5000);
  //	a.executeScript("arguments[0].click()",b);
      
      
      
      
      //select class example
      WebElement ele = driver.findElement(By.xpath("//select[@id='cars']"));
      
      Select sel= new Select(ele);
      Thread.sleep(2000);
      List<WebElement> opt = sel.getOptions();
      for (WebElement webb : opt)
      {
		System.out.println(webb.getText());
	}
      
      sel.selectByIndex(1);
      Thread.sleep(2000);
      
      sel.selectByValue("audi");
      Thread.sleep(2000);
      
      sel.selectByVisibleText("Opel");
      Thread.sleep(2000);
      
     sel.deselectByIndex(1);
     WebElement b = sel.getFirstSelectedOption();
     System.out.println(b.getText());
      Thread.sleep(2000);
      List<WebElement> a = sel.getAllSelectedOptions();
      for (WebElement we : a) 
      {
    	 System.out.println(we.getText());  
		
	}
         
      
      sel.deselectAll();
      
     // sel.
      
      
      
      
      
      
      
	}

}
