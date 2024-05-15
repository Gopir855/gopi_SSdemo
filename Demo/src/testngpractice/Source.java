package testngpractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Source 
{	
		public WebDriver driver;
		@BeforeMethod
		public void Open_App()
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			driver.navigate().to("https://demoapps.qspiders.com/");		
		}
		
		@AfterMethod
		public void close_app()
		{
			driver.close();
		}
	

}
