package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ToLearnMouseHover {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		WebElement homefur = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		Actions act=new Actions(driver);
		 act.moveToElement(homefur).perform();
		//act.moveByOffset(714, 131).perform();//in indudtry it is not recommended
}
}