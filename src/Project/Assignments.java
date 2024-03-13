package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignments {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://practice.expandtesting.com/context-menu");
		WebElement rclck = Driver.findElement(By.xpath("//div[@id='hot-spot']"));
		Actions act = new Actions(Driver);
		act.contextClick(rclck).perform();
	}

}
