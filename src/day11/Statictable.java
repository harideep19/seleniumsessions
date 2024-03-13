package day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statictable {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		Driver.manage().window().maximize();
		int rows=Driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println(rows);
		
		int col=Driver.findElements(By.xpath("//table[@id='customers']//td")).size();
		System.out.println(col);
		
		String value = Driver.findElement(By.xpath("//table[@id='customers']//td")).getText();
		System.out.println(value);
		
		for(int r=2;r<=rows;r++) {
			for(int c=1 ;c<=col;c++){
				
			String	data = Driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]//td[\"+c+\"]")).getText();
			
			System.out.println(data);
	
			}
			System.out.println();
		}
		List<WebElement> tdata = Driver.findElements(By.xpath("//table[@id='customers']//td"));
		
		for(WebElement options:tdata) {
			String values =options.getText();
			
			if(values.equals("Ola"));
			
			Driver.findElement(By.xpath("//td[text()='Ola']//preceding-sibling::td//input")).click();
		}


	}

}
