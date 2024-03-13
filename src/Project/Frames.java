package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		WebElement w1= driver.findElement(By.xpath("//button[text()='click ']"));
		driver.switchTo().frame(w1);
		Select drpwn = new Select(driver.findElement(By.xpath("//a[@id='navbarDropdown']")));
		drpwn.selectByIndex(3);
		driver.switchTo().defaultContent();
		WebElement w1= driver.findElement(By.xpath("//button[text()='click ']"));
		
	
		
	}

}
