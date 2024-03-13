package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender {
	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.phptravels.net/");
		Driver.manage().window().maximize();
		//Driver.findElement(By.xpath("//button[@class='nav-link w-100 waves-effect active']")).click();
		Driver.findElement(By.xpath("//input[@id='round-trip']")).click();
		//WebElement start =	Driver.findElement(By.xpath("//b[@role='presentation']"));
	//WebElement start =Driver.findElement(By.xpath("Pakistan"));
		//Select from=new Select(Driver.findElement(By.xpath("//b[@role='presentation']")));
		//from.selectByIndex(2);
		
		//Select from1=new Select(Driver.findElement(By.xpath("//select[@id='flight_type']]")));
		//from1.get
	}

}
