package testngpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Maincla2 extends Source 
{
	@Test(priority = 0)
	public void textfield()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//section[.='Text Box']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("aadagfeadcae");
		driver.findElement(By.xpath("//input[@placeholder='Enter your passWord']")).sendKeys("uityurfgh");
		String title = driver.getTitle();
		//Assert.assertEquals(title,"DemoAppsE!");
		SoftAssert s=new SoftAssert();
		s.assertEquals(title,"DemoAppsE!");
		s.assertAll();
	}
}
