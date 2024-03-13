package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://webdriveruniversity.com/Actions/index.html");
		Driver.manage().window().maximize();
		WebElement ele1= Driver.findElement(By.xpath("//button[@class='dropbtn']"));
		//oils
		WebElement ele2 = Driver.findElement(By.xpath("//div[@class='dropdown hover']//a[@class='list-alert'][text()='Link 1']"));
		
		Actions act =new Actions(Driver);
		act.moveToElement(ele1).moveToElement(ele2).click().perform();
	}

}
