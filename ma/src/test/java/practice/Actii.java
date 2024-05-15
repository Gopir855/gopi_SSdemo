package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.testng.annotations.Test;

public class Actii extends pgm
{
	
  @Test
 public void aaa()
 {
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("yfywe");
 }
}
