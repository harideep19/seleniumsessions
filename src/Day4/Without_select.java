package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_select {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Driver.manage().window().maximize();
		List<WebElement>option=Driver.findElements(By.xpath("//select[@id='animals']//option"));
		
		
//		for(int i=0;i<=option.size();i++) {
//			String alloption=option.get(i).getText();
//			System.out.println(alloption);
//		}
		
		
		
		for(WebElement abc:option) {
			if(abc.getText().equals("Baby Cat")){
				abc.click();
				break;
			}
			
			
		}
		
	}

}
