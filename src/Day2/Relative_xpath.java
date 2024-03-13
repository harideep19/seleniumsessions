package Day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;



public class Relative_xpath {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://adactinhotelapp.com/index.php");
		//Driver.manage().window().maximize();
		//Driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vamshinani");
		//Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vamshi@133");
		//Driver.findElement(By.xpath("//input[@type='Submit']")).click();
		Driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("Harideep");
		Driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("123654");
		Driver.findElement(By.xpath("//input[@type='Submit']")).click();

	}

}
