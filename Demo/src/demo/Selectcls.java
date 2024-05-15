package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectcls
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/r.php");
        Thread.sleep(2000);
        driver.manage().window().maximize();
      //  driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        
        WebElement ele = driver.findElement(By.xpath("//select[@id='day']"));
     
     // select class for date
        Select sel=new Select(ele);        
        sel.selectByValue("12");
        Thread.sleep(3000);
        sel.selectByIndex(1);
        Thread.sleep(3000);
        sel.selectByVisibleText("27");
        Thread.sleep(3000);
        
        WebElement ele1 = driver.findElement(By.xpath("//select[@id='month']"));
    //select class for month
        Select sel1=new Select(ele1);
        sel1.selectByIndex(10);
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
