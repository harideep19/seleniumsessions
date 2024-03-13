package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement frm1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frm1);
		driver.findElement(By.name("mytext1")).sendKeys("frame1");
		
		driver.switchTo().defaultContent();// to switch from main window
		WebElement frm2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frm2);
		driver.findElement(By.name("mytext2")).sendKeys("Frame 2");
		driver.switchTo().defaultContent();
		WebElement frm3= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frm3);
		driver.findElement(By.name("mytext3")).sendKeys("Frame 3");
		//driver.findElement(By.xpath("//div[@class='eAQI0e']")).click();
		driver.switchTo().defaultContent();
		WebElement frm4 = driver.findElement(By.xpath("// frame[@src='frame_4.html']"));
		driver.switchTo().frame(frm4);
		driver.findElement(By.name("name4")).sendKeys("frame 4");
	}

}
