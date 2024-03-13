package day12;

import java.io.File;

import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Screenshorts  {
	public static void main(String[] args)  {
		WebDriver driver =new ChromeDriver();
		/*driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		TakesScreenshot ss=(TakesScreenshot) driver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\Screenshot\\ajio.png";
		Files.copy(source,new File(destination));*/
		
	/*	TakesScreenshot ss1=(TakesScreenshot) driver;
		File source1=ss1.getScreenshotAs(OutputType.FILE);
		File destination1=new File("C:\\Users\\Hemanth\\OneDrive\\Desktop\\Hemanth\\ajio.png");
		Files.copy(source1, destination1);*/
		
		//File source2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Files.copy(source2, new File("C:\\Users\\Hemanth\\OneDrive\\Desktop\\Hemanth\\ajio1.jpg"));
	}
}