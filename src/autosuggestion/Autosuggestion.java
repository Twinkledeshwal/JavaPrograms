package autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.google.com/"); 
WebElement text = driver.findElement(By.xpath("//textarea[@name='q']"));
    text.sendKeys("sachin tendulkar");
      List<WebElement> list = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
    for(WebElement li:list) {
    	//System.out.println(li.getText());
    	//Thread.sleep(9000);
    	li.findElement(By.xpath("//li[contains(@data-entityname,'son')]")).click();
    	
    }
        //int count = list.size();        //10
    //   System.out.println(count); 
       
      // list.get(count-2).click();           // 8           click 9
       
       
	}

}
