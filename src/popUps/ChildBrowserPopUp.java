package popUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parent = driver.getWindowHandle();
driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
Set<String> all_ID = driver.getWindowHandles();

for(String id:all_ID) {
	if(!id.equals(parent)) {
		driver.switchTo().window(id);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}

	}

}
