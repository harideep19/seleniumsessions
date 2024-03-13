package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.guru99.com/test/");
		Driver.manage().window().maximize();
		WebElement dt=Driver.findElement(By.xpath("//input[@name='bdaytime']"));
		dt.sendKeys("02022024");
		dt.sendKeys(Keys.TAB);
		dt.sendKeys("1147pm");
		Driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
