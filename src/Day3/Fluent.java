package Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		Driver.manage().window().maximize();
		//fluent wait declaration
		Wait<WebDriver> wait=new FluentWait(Driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(ElementNotInteractableException.class);	
		Driver.findElement(By.xpath("//button[@id='btn1']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Show the textboxes here:']//input[@id='txt1']")));
		Driver.findElement(By.xpath("//h3[text()='Show the textboxes here:']//input[@id='txt1']")).sendKeys("explicit");
	



	}

}
