package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableFieldJSexecutor {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		
		WebElement link = driver.findElement(By.xpath("//a[text()='jdk-8u411-linux-aarch64.rpm']"));
		link.click();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement diabled = driver.findElement(By.xpath("//a[text()='Download jdk-8u411-linux-aarch64.rpm']"));
		
		js.executeScript("arguments[0].click();", diabled);
	}

}
