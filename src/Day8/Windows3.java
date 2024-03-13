package Day8;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows3 {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.automationtesting.in/Windows.html");
		Driver.manage().window().maximize();
	String s1=	Driver.getWindowHandle();
	System.out.println(s1);
	Driver.findElement(By.xpath("//button[text()='click']")).click();
	Set<String> s2 = Driver.getWindowHandles();
	//Iterator <String> ids = s2.iterator();
	for(String handels:s2) {
		if(handels.equals(s2))
	}
	
//	String s3 =ids.next();
//	String s4 = ids.next();
//	System.out.println(s3);
//	System.out.println(s4);
//	

	}

}
