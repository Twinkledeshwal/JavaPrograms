package iFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://ui.vision/demo/webtest/frames/"); 
       WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        
        driver.switchTo().frame(frame3);
        
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("selenium");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]")).click();

        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
