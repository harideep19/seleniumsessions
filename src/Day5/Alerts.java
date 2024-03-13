package Day5;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Alerts {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Driver.manage().window().maximize();
		//simple alert
//		Driver.findElement(By.id("alertBox")).click();
//		 String sms=Driver.switchTo().alert().getText();
//		 System.out.println(sms);
//		Driver.switchTo().alert().accept();
		
		//confirm alert
//		Driver.findElement(By.id("confirmBox")).click();
//		String sms1=Driver.switchTo().alert().getText();
//		System.out.println(sms1);
//		//Driver.switchTo().alert().accept();
//		Driver.switchTo().alert().dismiss();
//		
		//promt alerts
		Driver.findElement(By.id("promptBox")).click();
		String sms3 = Driver.switchTo().alert().getText();
		System.out.println(sms3);
		Driver.switchTo().alert().sendKeys("Harideep");
		Driver.switchTo().alert().accept();

	}

}
