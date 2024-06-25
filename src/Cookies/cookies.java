package Cookies;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookies {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.myntra.com/");
      /* Set<Cookie> cookies = driver.manage().getCookies();
       for(Cookie c:cookies) {
    	   
      System.out.println(c.getName()+"   "+c.getValue());
     }
    */  
         Cookie c1= new Cookie("love", "pragyan");
       driver.manage().addCookie(c1);
      
       
       driver.manage().deleteCookieNamed("_xsrf");
       driver.manage().deleteCookieNamed("love");
       Set<Cookie> cookies = driver.manage().getCookies();
       for(Cookie c:cookies) {
    	   
      System.out.println(c.getName()+"   "+c.getValue());
     }
	}

}
