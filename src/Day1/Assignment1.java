package Day1;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriver Driver =new ChromeDriver();
		Driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
			//Driver.get("https://www.youtube.com/");
		Driver.manage().window().maximize();		
		Driver.findElement(By.id("firstName")).sendKeys("Harideep");
		Driver.findElement(By.id("lastName")).sendKeys("Aepuri");
		//Driver.findElement(By.id("firstName")).clear();
		//Driver.findElement(By.name("lName")).sendKeys("deep");
		Driver.findElement(By.id("malerb")).click();
		Driver.findElement(By.id("englishchbx")).click();
		Driver.findElement(By.id("email")).sendKeys("harideep1924@gmail.com");
		Driver.findElement(By.name("psw")).sendKeys("123456789");
		Driver.findElement(By.id("registerbtn")).click();
		//Driver.findElement(By.id("clearbtn")).click();
	   //Driver.findElement(By.id("navigateHome")).click();
		int imgs=Driver.findElements(By.tagName("img")).size();
		System.out.println(imgs);
		
		}

}
