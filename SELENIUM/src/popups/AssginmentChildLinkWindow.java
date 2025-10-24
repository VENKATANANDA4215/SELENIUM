package popups;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssginmentChildLinkWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		
		driver.findElement(By.id("browserButton3")).click();
		
		switchToWindow (driver,"SignUp");
		driver.findElement(By.id("email")).sendKeys("doodakananda1919@gmail.com");
		Thread.sleep(3000);
		
		switchToWindow(driver,"Login");
		driver.findElement(By.id("password")).sendKeys("Nanda@4215");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[contains(@class,'absolute')]")).click();	
	}
	

	private static void switchToWindow(WebDriver driver, String expectedUrl) {
		
		 Set<String> wid = driver.getWindowHandles();
		for(String id : wid)
		{
			driver.switchTo().window(id);
		   String url = driver.getCurrentUrl();
			if(url.contains(expectedUrl))
			{
				break;
			}
		}
	}
}

