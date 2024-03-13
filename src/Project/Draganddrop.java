package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://webdriveruniversity.com/Actions/index.html");
		Driver.manage().window().maximize();
		WebElement from = Driver.findElement(By.xpath("//b[text()='DRAG ME TO MY TARGET!']"));
		WebElement to = Driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act =new Actions(Driver);
		act.dragAndDrop(from, to).perform();
		
		WebElement dbclck = Driver.findElement(By.xpath("//h2[text()='Double Click Me!']"));
		 
		Actions act1 = new Actions(Driver);
		act1.doubleClick(dbclck).perform();
		
		WebElement click= Driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
		Actions act2 = new Actions(Driver);
		act2.moveToElement(click).perform();
		
		//WebElement click= Driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
		
		
	
	}

}
