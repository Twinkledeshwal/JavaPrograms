package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class singleSelectNotBySelectTag {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/select-menu");
		
		WebElement ele = driver.findElement(By.xpath("//div[text()='Select Option']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.sendKeys(ele,"Group 2, option 1").sendKeys(Keys.ENTER).perform();
		
		
		
	}

}