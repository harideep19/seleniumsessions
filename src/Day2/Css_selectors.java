package Day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class Css_selectors {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Driver.manage().window().maximize();
		Driver.findElement(By.cssSelector("input#firstName")).sendKeys("Harideep"); //tag and id use # to seperate
		Driver.findElement(By.cssSelector("input[placeholder='Enter Last Name']")).sendKeys("Aepuri"); //tag and attribute use [] to seperate
		Driver.findElement(By.cssSelector("input.bcCheckBox[id='englishchbx']")).click();  //Tag, class and attribute
       int imgs=Driver.findElements(By.className("img")).size();
       System.out.println(imgs);
	}

}
