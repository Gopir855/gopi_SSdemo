package prct;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runpgm extends genpgm
{
	/*
	 * @Test public void login() {
	 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
	 * "gopidealz4@gmail.com");
	 * driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("@Nokiaasha501")
	 * ; driver.findElement(By.xpath("//button[.='Log in']")).click(); }
	 */
	
	@Test
	public void signup()
	{
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("hfjsvd");
	}
}
