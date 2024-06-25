package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	/*	
		driver.get("https://demoapp.skillrary.com/");
            JavascriptExecutor js= (JavascriptExecutor)driver;
                js.executeScript("window.scrollBy(0,600)");
	*/	
		
	/*	driver.get("https://www.kwokyinmak.com/");
        JavascriptExecutor js= (JavascriptExecutor)driver;
        Thread.sleep(3000);
            js.executeScript("window.scrollBy(2000,0)");
	*/	
		
		driver.get("https://demoapp.skillrary.com/");
        JavascriptExecutor js= (JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(3000);
            js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		
		
		
		
	}

}
