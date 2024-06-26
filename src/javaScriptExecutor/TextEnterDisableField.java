package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextEnterDisableField {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapp.skillrary.com/");
		WebElement text = driver.findElement(By.xpath("//input[@class='form-control']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].value='twinkledeshwal1602@gmail.com';", text);
	}

}
//(//div[@class='myx-indexContainer'])[12]/div/div/div/div/div[1]