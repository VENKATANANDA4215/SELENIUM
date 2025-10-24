package randomassignement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//input[@type=\'text\']")).sendKeys("iphone17");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//driver.findElement(By.name("Apple iPhone 15 Plus (Black, 128 GB)")).click();
	

}
}

