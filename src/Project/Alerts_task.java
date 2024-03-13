package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts_task {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demoqa.com/alerts");
		Driver.manage().window().maximize();
//		Driver.findElement(By.xpath("//button[@id='alertButton']")).click();
//     	String	sms=Driver.switchTo().alert().getText();
//	    System.out.println(sms);
		
//		Driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
//		String smss=Driver.switchTo().alert().getText();
//		System.out.println(smss);
//		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Driver.switchTo().alert().accept();
		

//	    Driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
//    	String  sms2=  Driver.switchTo().alert().getText();
//    	System.out.println(sms2);
//    	Driver.switchTo().alert().accept();
//    	
	   Driver.findElement(By.xpath("//button[@id='promtButton']")).click();
    	String sms3= Driver.switchTo().alert().getText();
    	System.out.println(sms3);
    	Driver.switchTo().alert().sendKeys("Harideep");
    	//Driver.switchTo().alert().accept();
	    
	}

}
