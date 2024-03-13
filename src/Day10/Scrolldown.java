package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.hyrtutorials.com/");
		Driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)Driver;
		
		//WebElement act = Driver.findElement(By.xpath("//span[@class='bmc-btn-text']"));
		js.executeScript("arguments[0].scrollIntoView();",act);
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//js.executeScript("window.scrollBy(0,500)", "");

	}

}
