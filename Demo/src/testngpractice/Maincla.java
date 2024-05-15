package testngpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Maincla extends Source
{

	
	@Test(priority = 1,enabled = true)
	public void button() 
	{
		//implicate wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//section[.='Button']")).click();
		
		//explicate wait
		WebDriverWait waitt= new WebDriverWait(driver, Duration.ofSeconds(5));
		waitt.until(ExpectedConditions.titleContains("DemoApps | Qspider"));
		
		driver.findElement(By.xpath("//button[.='Yes'][1]")).click();
		driver.findElement(By.xpath("//button[.='No'][1]")).click();
		driver.findElement(By.xpath("//button[.='5']")).click();
		driver.findElement(By.xpath("//button[.='3']")).click();
		
		
		
	}
	
		
	
	

	}


