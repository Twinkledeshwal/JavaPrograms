package webTable_calender;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws  Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		
	//expected date	
	String year= "2025";
	String month= "May";
	String date= "20";	
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //opens date picker
		
		//select month & year
		
		while(true)
		{
		String current_Month =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();	
		String current_Year =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();	
			
		if(current_Month.equals(month) && current_Year.equals(year))
		{
			break;
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		for(WebElement dt:alldates) {
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
		
	}

}
