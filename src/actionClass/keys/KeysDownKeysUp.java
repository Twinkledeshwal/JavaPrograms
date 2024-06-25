package actionClass.keys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysDownKeysUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://text-compare.com/");
		WebElement input1= driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2= driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		input1.sendKeys("pragyan is my life");
		
		Actions act= new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		act.sendKeys(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		if (input1.getAttribute("value").equals(input2.getAttribute("value"))) {
			System.out.println("text is copied");
		}else {
			System.out.println("not copied");
		}
		
		
	}

}
