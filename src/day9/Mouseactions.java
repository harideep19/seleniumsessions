package day9;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		/*Driver.get("https://demoqa.com/buttons");
		Driver.manage().window().maximize();
		
		WebElement Dbclck = Driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Actions act = new Actions(Driver);
		act.doubleClick(Dbclck).perform();
		WebElement rclick = Driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		Actions act1 = new Actions(Driver);
		act1.contextClick(rclick).perform();
		WebElement Click = Driver.findElement(By.xpath("//button[@id='AXusD']"));
		Actions act2 = new Actions(Driver);
		act2.moveToElement(Click).click().perform();*/
		Driver.get("https://practice.expandtesting.com/context-menu");
		WebElement rclcick = Driver.findElement(By.xpath("//div[@id='hot-spot']"));
		Actions act3 =new Actions (Driver);
		act3.contextClick(rclcick).perform();
	}

}
