package webDriverMethods.navigation;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.myntra.com/"); 
Navigation nav = driver.navigate();
nav.forward();
Thread.sleep(3000);
nav.back();
Thread.sleep(3000);
nav.refresh();
Thread.sleep(3000);
nav.to("https://www.myntra.com/shop/men");

	}

}
