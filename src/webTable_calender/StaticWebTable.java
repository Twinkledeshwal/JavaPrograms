package webTable_calender;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
     /*  
		List<WebElement> lists = driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr"));
		for(WebElement list:lists) {
			System.out.println(list.getSize());
			System.out.println(list.getText());
			}
	String	td=driver.findElement(By.xpath("(//table[@id='product'])[1]/tbody/tr[10]/td[2]")).getText();
		System.out.println(td);
	*/	
		//2 table
		
		String	td=driver.findElement(By.xpath("(//table[@id='product'])[2]//tbody//td[text()='Receptionist']")).getText();
		System.out.println(td);
		
		List<WebElement>	td1=driver.findElements(By.xpath("(//table[@id='product'])[2]//tbody//td[4]"));
		for(WebElement td2:td1) {
			
			System.out.println(td2.getText());
			}
	
		
		
		
		

		
		
		
	}

}
