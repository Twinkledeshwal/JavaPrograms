package webDriverMethods.windowsMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.myntra.com/"); 
        Window win = driver.manage().window();
        win.maximize();
        Thread.sleep(3000);
        win.minimize();
        win.fullscreen();

	}

}
