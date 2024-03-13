package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demoqa.com/droppable");
		
		Driver.manage().window().maximize();
		WebElement from = Driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		
		WebElement to=Driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(Driver);
		act.dragAndDrop(from, to).perform();


	}

}
