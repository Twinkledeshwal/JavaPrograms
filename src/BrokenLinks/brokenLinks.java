package BrokenLinks;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://www.deadlinkcity.com/");                                 //How to identify broken links in Selenium WebDriver

                                                                                  // Use <a> tag to fetch all the links present on a web page.
                                                                                   // Send HTTP request for the link.
                                                                                   //   Verify the HTTP response code for the link.
                                                                                 //  Determine if the link is valid or it is broken 
                                                                                //   based on the HTTP response code.
        List<WebElement> tags = driver.findElements(By.tagName("a"));                 
        try {
        	for(WebElement tag:tags) {
            	
            	String url = tag.getAttribute("href");
            	URL link= new URL(url);
            	
           HttpURLConnection httpconn = (HttpURLConnection)link.openConnection();
            	httpconn.connect();
            	int rescode = httpconn.getResponseCode();
            	if(rescode>=400) {
            		System.out.println(url+"  broken link  "+rescode);
            	}else{
            		System.out.println(url+"  not broken link  "+rescode);
            	}
            		
       }
		} catch (Exception e) {
			e.getMessage();
		}
        



	}

}
