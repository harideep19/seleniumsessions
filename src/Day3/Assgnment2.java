package Day3;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgnment2 {
	public static  void textBox(WebDriver driver)  {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Harideep");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("harideep@gmail.com");
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("Hyd");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("hyd");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
	}
	public static  void checkBox(WebDriver driver) {
		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
		
	}
	public static void radioButton(WebDriver driver)  {
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
		driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
		
	}

	public static void main(String[] args)  {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
	//	driver.manage().window().maximize();
		Assgnment2.textBox(driver);
		Assgnment2.checkBox(driver);
		Assgnment2.radioButton(driver);
		
		
	}
}