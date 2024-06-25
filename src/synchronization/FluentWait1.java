package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWait1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("deshwaltwinkle2516@gmail.com");
	
	Wait<WebDriver> fwait= new FluentWait<WebDriver>(driver)
			.pollingEvery(Duration.ofSeconds(2)).withTimeout(Duration.ofSeconds(30)).ignoring(TimeoutException.class);
		
	WebElement Continue = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
		
	fwait.until(ExpectedConditions.elementToBeClickable(Continue));
	Continue.click();
		
	}

}
/*
 Initialize the WebDriver instance (e.g., ChromeDriver).

Define the Fluent Wait object with the WebDriver instance:

    Specify the maximum wait time using        withTimeout(Duration.ofSeconds(timeoutInSeconds)).
    Set the polling interval using       pollingEvery(Duration.ofSeconds(intervalInSeconds)).
    Optionally, specify exceptions to ignore during the waiting period using        ignoring(Exception.class).
    
    Dynamic Polling Interval
    Custom Wait Conditions
    Ignoring Certain Exceptions
    
    
    
    
    
    
    
    
*/




