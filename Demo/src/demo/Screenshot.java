package demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException 
	{
		
		 WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		
	//	To take an screenshot	
		
		TakesScreenshot TS = (TakesScreenshot)driver;
		
		File temp = TS.getScreenshotAs(OutputType.FILE);
		
		File dst = new File("C:\\Users\\gopi\\Desktop\\st.png");
		
		FileHandler.copy(temp, dst);
		
		driver.quit();
	}

}
