package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByINDP {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		WebElement element = driver.findElement(By.xpath("//input[@name='username']"));
		element.sendKeys("NandaDoddaka");
		WebElement ele = driver.findElement(By.xpath("//input[@type=\"password\"]"));	
		ele.sendKeys("Nanda@4215");
}

}
