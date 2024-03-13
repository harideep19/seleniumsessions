package day12;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Sshot {

	public static void main(String[] args) throws IOException {
		WebDriver Driver =new ChromeDriver();
		
		Driver.get("https://www.ajio.com/");
		TakesScreenshot ss= (TakesScreenshot)Driver;
		
		File source = ss.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"\\Screenshot\\ajio.png";
		Files.copy(source,new File(destination));
	}

}
