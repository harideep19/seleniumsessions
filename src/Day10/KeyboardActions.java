package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demoqa.com/text-box");
		Driver.manage().window().maximize();
		
		Driver.findElement(By.xpath("//input[@id='userName']")).click();
		Actions act = new Actions(Driver);
		act.keyDown(Keys.SHIFT);
		act.sendKeys("harideep");
		act.keyUp(Keys.SHIFT);
		act.perform();
		Driver.findElement(By.xpath("//input[@id='userEmail']")).click();
		Actions act1 = new Actions(Driver);
		act1.sendKeys("harideep1924");
		act1.keyDown(Keys.SHIFT);
		act1.sendKeys("2");
		act1.keyUp(Keys.SHIFT);
		act1.sendKeys("gmail.com");
		act1.perform();
		
		
	}

}
