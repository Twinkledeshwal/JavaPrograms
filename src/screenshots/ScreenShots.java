package screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.myntra.com/"); 
         TakesScreenshot shot= (TakesScreenshot)driver;
         
       // File source = shot.getScreenshotAs(OutputType.FILE);
         
       //  File dest= new File("./screenshots/myntra.png");
      //   Files.copy(source, dest);
	
	
	WebElement logo = driver.findElement(By.xpath("//a[starts-with(@class,'myntraweb')]"));
	
	File source = logo.getScreenshotAs(OutputType.FILE);
    
     File dest= new File("./screenshots/logo.png");
    Files.copy(source, dest);
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	

}
