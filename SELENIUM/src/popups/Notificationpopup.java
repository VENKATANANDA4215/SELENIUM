package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationpopup {
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--incognito");
		opt.addArguments("--start-maximized");
		opt.addArguments("--start-fullscreen");
		
		WebDriver driver=new ChromeDriver(opt);//adding the browser setting
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		driver.findElement(By.id("browNotButton")).click();
		
		
		

}
}