package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnSwicthTo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://shoppersstack.com/products_page/23");
	Thread.sleep(20000);
	
	
	driver.findElement(By.id("Check Delivery")).click();
	
	String title=driver.getTitle();
	System.out.println(title);
	
           Set<String> allWindowIds = driver.getWindowHandles();
           
           for(String id:allWindowIds)
           {
        	   System.out.println(id);
        	   driver.switchTo().window(id);
        	   Thread.sleep(10000);
        	 String actualUrl = driver.getCurrentUrl();
        	 if(actualUrl.equals("https://www.amazon.com/"));
        	 driver.close();
           }
}
}
