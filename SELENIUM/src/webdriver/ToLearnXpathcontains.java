package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathcontains {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		driver.findElement(By.xpath("//input[contains(@aria-label,'username')")).sendKeys("421523");
		Thread.sleep(1000);
		driver.close();
	}
}
