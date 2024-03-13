package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multidropdown {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Driver.manage().window().maximize();
		Select drpdwn = new Select(Driver.findElement(By.xpath("//select[@id='second']")));
		
		
		drpdwn.selectByIndex(3);
		drpdwn.selectByValue("burger");
		
//		if(drpdwn.isMultiple()){
//			drpdwn.selectByIndex(3);
//			drpdwn.selectByValue("burger");
//			
//		}

}
}