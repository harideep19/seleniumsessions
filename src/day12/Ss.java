package day12;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Ss {

	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
	/*	TakesScreenshot ss=(TakesScreenshot) driver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\Screenshort\\ajio.png";
		Files.copy(source, new File(destination));*/
		
		
		TakesScreenshot ss1=(TakesScreenshot) driver;
		File source1=ss1.getScreenshotAs(OutputType.FILE);
		File destination1=new File("C:\\Users\\DELL\\Desktop\\Harideep\\ajio.png");
		Files.copy(source1, destination1);
	}

}
