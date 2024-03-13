package Day14;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Project.Calender;
import io.ous.jtoml.ParseException;

public class Featuredate {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();	
		String trgetdate ="30/mar/2023";
		Calendar  cal = Calendar.getInstance();
		SimpleDateFormat Sdf = new SimpleDateFormat("dd/mmm/yyyy");
		try {
			Sdf.setLenient(false);
			Date date1 = (Date) Sdf.parse(trgetdate);
			cal.setTime(date1);
			int tday = cal.get(cal.DAY_OF_MONTH);
			int tmon = cal.get(cal.MONTH);
			int tyear = cal.get(cal.YEAR);
			driver.findElement(By.id("first_date_picker")).click();
			String currentdate=driver.findElement(By.className("ui-datepicker-title")).getText();

			SimpleDateFormat Sdf1 = new SimpleDateFormat("dd/mmm/yyyy");
			Date date2 = (Date) Sdf1.parse(currentdate);
			cal.setTime(date2);
			int cmon= cal.get(cal.MONTH);
			int cyear = cal.get(cal.YEAR);
			
			while(cmon>tmon||cyear>tyear) {
				driver.findElement(By.className("ui-datepicker-next")).click();
				
				currentdate=driver.findElement(By.className("ui-datepicker-title")).getText();
				SimpleDateFormat Sdf2 = new SimpleDateFormat("dd/mmm/yyyy");
				Date date3 = (Date) Sdf1.parse(currentdate);
				cmon=cal.get(cal.MONTH);
				 cyear=cal.get(cal.YEAR);		 	
			}
			driver.findElement(By.xpath("//a[text()="+trgetdate+"]")).click();
		}catch(ParseException e) {
			throw new Exception("The targetdate is Invalid Please check");
		}
	}
}


			