package testng_script;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class File_UploadPopup extends Generic_Launch
{
	@Test(priority = 1,enabled = false)
	public void file_Upload_Popup() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[.='File Uploads']")).click();
		WebElement button = driver.findElement(By.id("fileInput"));
		button.sendKeys("C:\\Users\\gopi\\Desktop\\UPDATED manual notes main.txt");
		Thread.sleep(3000);
	}
	@Test(priority = 2,enabled = false)
	public void Alert_Popup() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[.='Javascript']")).click();
		driver.findElement(By.xpath("//button[.='Alert Box']")).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(3000);
	}
	@Test(priority = 2)
	public void Synchronization_Bar() throws InterruptedException
	{
		driver.findElement(By.xpath("//section[.='Synchronization']")).click();
		driver.findElement(By.xpath("//section[.='Progress Bar']")).click();
		driver.findElement(By.xpath("//button[.='Start']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.attributeContains(By.xpath("//span[.='100%']"), "class", "text-xs font-semibold inline-block text-black"));
		driver.findElement(By.xpath("//button[.='Reset']")).click();	
		driver.findElement(By.xpath("//button[.='Start']")).click();
		Thread.sleep(3000);
	}
	
	
}
