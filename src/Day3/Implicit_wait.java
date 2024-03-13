package Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {
	public static void main(String[] args) {
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		//Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Driver.findElement(By.xpath("//button[@id='alert']")).click();
		Driver.findElement(By.xpath("//button[@id=\"populate-text\"]")).click();
		Driver.findElement(By.xpath("//button[@id=\"display-other-button\"]")).click();
		Driver.findElement(By.xpath("//button[@id=\"enable-button\"]")).click();
		Driver.findElement(By.xpath("//button[@id=\"checkbox\"]")).click();
//		Driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
//		Driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
//		Driver.findElement(By.xpath("//button[@type='submit']")).click();
//		

		
		
		
	}
}
