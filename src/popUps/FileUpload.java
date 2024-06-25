package popUps;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=CjwKCAjwg8qzBhAoEiwAWagLrJikQd2MIAZ3EwWMKoSyUGGthOCt0m_ALPxHNGn4GVM2SOjH2oSaZRoCC18QAvD_BwE&gclsrc=aw.ds");
         driver.findElement(By.xpath("(//div[@class='textWrap'])[1]")).click();
         driver.findElement(By.xpath("//button[contains(text(),'Upload Resume')]")).click();
         Runtime.getRuntime().exec("./autoit/up.exe");
	}

}
