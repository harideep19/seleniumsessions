package Day1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		
		

				WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("hemanth");
		driver.findElement(By.name("lName")).sendKeys("buragadda");
		driver.findElement(By.id("malerb")).click();
		driver.findElement(By.id("femalerb")).click();
		driver.findElement(By.className("bcCheckBox")).click();
		driver.findElement(By.name("email")).sendKeys("bhnghemanth@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456789");
		driver.findElement(By.id("registerbtn")).click();
		
		driver.findElement(By.className("bcButton")).click();
		
		//driver.findElement(By.id("navigateHome")).click();
		
		

	}

}
