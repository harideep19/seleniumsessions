package Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicity1 {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		//Driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		Driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		Driver.manage().window().maximize(); 
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(20));
		//Driver.findElement(By.xpath("//button[@id='alert']")).click();
		Driver.findElement(By.xpath("//button[@id='populate-text']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@id='h2']")));
		WebDriverWait wait1 = new WebDriverWait(Driver,Duration.ofSeconds(20));
		Driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));

	}

}
