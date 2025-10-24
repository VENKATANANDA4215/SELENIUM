package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.findElement(By.id("name")).sendKeys("Nanda");
		driver.findElement(By.id("email")).sendKeys("doddakananda@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Nanda@4215");
		WebElement button = driver.findElement(By.xpath("//button[@class='eye-button resman-btn-empty resman-btn-small']"));
		Actions act=new Actions(driver);
		act.clickAndHold(button).pause(2000).release().perform();
		driver.findElement(By.id("mobile")).sendKeys("6281556053");
		driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\dodda\\Documents\\MY DOCUMENTS\\VenkataNanda.D.pdf");
		WebElement check = driver.findElement(By.xpath("//span[@class='chk-label']"));
		Actions act1=new Actions(driver);
		act.clickAndHold(check).pause(2000).release().perform();
		
		

}
}