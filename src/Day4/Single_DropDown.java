package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_DropDown {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Driver.manage().window().maximize();
		//Select drpdwn=new Select(Driver.findElement(By.xpath("//select[@id='first']")));
		Select drpdwn=new Select(Driver.findElement(By.xpath("//button[@id='custom']")));
		
		drpdwn.selectByVisibleText("Google");
		//drpdwn.selectByIndex(1);
		//drpdwn.selectByValue("Google");
		
		
		
		
		
	
	}
	

}
