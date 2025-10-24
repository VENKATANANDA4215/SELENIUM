package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIframe {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.dream11.com/");
		//driver.switchTo().frame(0);//index
		//driver.switchTo().frame("send-sms-iframe");//name or id of <iframe>tag
		
		WebElement iframeExp = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));//<iframe> tag address
		driver.switchTo().frame(iframeExp);
		driver.findElement(By.id("regEmail")).sendKeys("6281556053");
		
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.findElement(By.id("hamburger")).click();
		
	}

}
