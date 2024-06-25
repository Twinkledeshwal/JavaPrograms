package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectBySelectTag {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/select-menu");
		WebElement s= driver.findElement(By.xpath("//select[@id='cars']"));
		Select s1= new Select(s);
             s1.isMultiple();
		
		List<WebElement> options = s1.getOptions();
		for(WebElement option:options) {
			System.out.println(option.getText());
			System.out.println(options.size());
		}
		s1.selectByIndex(3);
		Thread.sleep(3000);
		s1.selectByValue("volvo");
		Thread.sleep(3000);
		s1.selectByVisibleText("Opel");
		List<WebElement> all = s1.getAllSelectedOptions();
		System.out.println("------------------------------------------------");
		for(WebElement a:all) {
			System.out.println(a.getText());
			System.out.println(all.size());
		}
		
System.out.println(s1.getFirstSelectedOption());
	}

}
