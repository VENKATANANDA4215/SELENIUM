package iframe;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
		driver.switchTo().frame(iframe1);
		Thread.sleep(2000);
		driver.findElement(By.name("Montana")).clear();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.id("user")).sendKeys("doddakananda1919@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("421523720487");
		driver.findElement(By.id("cpass")).sendKeys("421523720487");
		driver.findElement(By.id("firstName")).sendKeys("nanda");
		driver.findElement(By.id("lastName")).sendKeys("doddaka");
		driver.findElement(By.id("phone")).sendKeys("6281556053");
		
		WebElement dropdown = driver.findElement(By.id("user-type"));
		Select user =new Select(dropdown);
		user.selectByVisibleText("Pet Owner");
		Thread.sleep(2000);
		
		
		
	}

}
