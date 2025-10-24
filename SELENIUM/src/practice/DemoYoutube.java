package practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoYoutube {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();		
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    driver.get("https://www.youtube.com/");
	    driver.findElement(By.xpath("//input[@name='search_query']")).click();
	    driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("kindomteaser");
	    
	    //driver.findElement(By.id("id=\"button\"")).click();
	    //driver.findElement(By.xpath("//input[@name='search_query']")).click();
	}

}
