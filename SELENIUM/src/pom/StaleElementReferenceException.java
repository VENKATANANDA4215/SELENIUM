package pom;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		
		MyntraPage mp=new MyntraPage(driver);
		mp.getserachTF().sendKeys("Shoes",Keys.ENTER);
		mp.getserachTF().sendKeys("wacthes");
		
		
		
		/*WebElement searchTF = driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products')]"));
		searchTF.sendKeys("Shoes",Keys.ENTER);
		searchTF.sendKeys("wacth");//when we use old element we get StaleElementReferenceException to over come this we use pom page
		*/
	}

}
