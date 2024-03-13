package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement from = Driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		
		WebElement to = Driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act = new Actions(Driver);
		act.dragAndDrop(from, to).perform();
		
		
	}

}
