package Day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class Goldbelly {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.goldbelly.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	
		
		
	}
	

}
