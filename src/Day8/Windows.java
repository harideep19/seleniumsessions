package Day8;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demoqa.com/browser-windows");
		Driver.manage().window().maximize();
	String str =	Driver.getWindowHandle();
	System.out.println(str);
	Driver.findElement(By.xpath("//button[@id='tabButton']")).click();
	Set<String> str1 = Driver.getWindowHandles();
	Iterator <String> ids = str1.iterator();
	
//	String s1 =ids.next();
//	String s2 = ids.next();
//	
//	String s2url =Driver.switchTo().window(s2).getCurrentUrl();
//	System.out.println(s2url);
//	String s1url = Driver.switchTo().window(str).getCurrentUrl();
//	System.out.println(s1url);
//	
	}

}
