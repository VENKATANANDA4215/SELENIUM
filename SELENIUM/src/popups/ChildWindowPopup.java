package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://shoppersstack.com/products_page/23");
		
		driver.findElement(By.id("compare")).click();
		swicthToWindow(driver,"amazon");
		driver.manage().window().maximize();
		driver.close();
		
		swicthToWindow(driver,"ebay");
		driver.manage().window().maximize();
	}	
		
		
		
	/*	Set<String> allwindowIds = driver.getWindowHandles();
		for(String id:allwindowIds)
		{
			driver.switchTo().window(id);//swicth to any window
			String url = driver.getCurrentUrl();
			{
				if (url.contains("amazon"))
				{
					break;
				}
			}
			
			driver.manage().window().maximize();
			
		}
	}
*/
	private static void swicthToWindow(WebDriver driver, String expurl) {
		
		Set<String> allwindowIds = driver.getWindowHandles();
		for(String id:allwindowIds)
		{
			driver.switchTo().window(id);
			String acturl = driver.getCurrentUrl();
			if(acturl.contains(expurl))
			{
				break;
			}
		}
	}

}
	