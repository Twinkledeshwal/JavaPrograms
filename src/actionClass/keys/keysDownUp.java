package actionClass.keys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keysDownUp {

	public static void main(String[] args) {
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.netflix.com/in");
		WebElement button= driver.findElement(By.linkText("Sign In"));
		Actions act= new Actions(driver);
		act.keyDown(Keys.CONTROL).click().keyUp(Keys.UP).perform();
		act.click(button).perform();
		
		
		
		
		
		
	}

}
