package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender1 {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		Driver.manage().window().maximize();
		
		WebElement cal6 =Driver.findElement(By.xpath("//input[@id='sixth_date_picker']"));
		cal6.sendKeys("02/01/2024");
		
		int day=10;
		Driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
		Driver.findElement(By.xpath("//a[text()="+day+"]")).click();
		
		day=20;

	Driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
	//Driver.findElement(By.xpath("//td[@class=' ui-datepicker-other-month ']//a[text()='29']")).click();
	Driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month '))]//a[text()="+day+"]")).click();
		
	
	}

}
