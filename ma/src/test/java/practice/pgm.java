package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class pgm 
{
		public WebDriver driver;
		
		@BeforeMethod
		public void Open_App()
		{
			driver=new FirefoxDriver();
			driver.navigate().to("https://demoapps.qspiders.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//	driver.findElement(By.xpath("//section[.='Popups']")).click();
   
	}
		
		@AfterMethod
		private void close() 
		{
		driver.close();// TODO Auto-generated method stub

		}

}
