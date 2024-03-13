package Project;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Saucedemo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(5000);
	Select drpdwn = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
	Thread.sleep(5000);
	drpdwn.selectByIndex(2);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='checkout']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Harideep");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Aepuri");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("025874");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='finish']")).click();
}

}
