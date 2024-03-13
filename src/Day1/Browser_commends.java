package Day1;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.*;

public class Browser_commends {

	//Browser_commands
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		// navigation commands
		
		driver.navigate().to("https://www.hotstar.com/in/home?ref=%2Fin");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		}

}
