package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleSelect {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement drop = driver.findElement(By.tagName("select"));
		Select s= new Select(drop);
		s.isMultiple();
		
		List<WebElement> options = s.getOptions();
		for(WebElement option:options) {
			option.getText();
			options.size();
		}
		s.selectByIndex(5);
		Thread.sleep(3000);
		s.selectByValue("AUS");
		Thread.sleep(3000);
		s.selectByVisibleText("Bahamas");
	}

}
