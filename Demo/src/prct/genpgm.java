package prct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class genpgm
{
public WebDriver driver;
	
@BeforeMethod
	public void launch()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
	}

   @AfterMethod
   public void close()
   {
	//driver.close();
	}
}
