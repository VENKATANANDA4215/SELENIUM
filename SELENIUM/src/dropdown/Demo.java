package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/desktops?orderby=5");
		//driver.findElement(By.xpath("//a[@href=\"/computers\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"/desktops\"]"));
		WebElement prod = driver.findElement(By.id("products-orderby"));
		//WebElement view = driver.findElement(By.id("products-viewmode"));
		
		Select ref=new Select(prod);
		ref.selectByIndex(3);
	
	}

}
