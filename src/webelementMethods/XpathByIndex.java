package webelementMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {

	public static void main(String[] args) {
		
                  WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.myntra.com/"); 
		List<WebElement> evenLinks = driver.findElements(By.xpath("(//a)[position() mod 2 = 0]"));
		System.out.println(evenLinks.size());
		for(WebElement link:evenLinks) {
			System.out.println(link.getText());
		}
	}

}
