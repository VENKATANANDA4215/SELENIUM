package testng;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class DemoClasss {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	WebElement photoframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(photoframe);
	
	WebElement img1 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
	WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
	WebElement trash = driver.findElement(By.id("trash"));
	Actions act=new Actions(driver);
	act.dragAndDrop(img1, trash).perform(); 
	act.dragAndDrop(img2, trash).perform();
	driver.switchTo().parentFrame();
	Thread.sleep(2000);
	driver.navigate().back();
    Thread.sleep(2000);
	driver.navigate().forward();
    driver.findElement(By.xpath("(//a[text()='CheatSheets'])[1]")).click();
	driver.findElement(By.xpath("//a[text()='SQL Cheat Sheet']")).click();
	Set<String> window = driver.getWindowHandles();
	for(String id:window) {
	      driver.switchTo().window(id);
	    }
  WebElement element = driver.findElement(By.xpath("(//img[@data-recalc-dims='1'])[2]"));
  JavascriptExecutor js=(JavascriptExecutor) driver;
  js.executeScript("arguments[0].scrollIntoView(true)",element);
   Thread.sleep(2000);
  TakesScreenshot ts=(TakesScreenshot) driver;
  File temp = ts.getScreenshotAs(OutputType.FILE);
  File dest=new File("./Screenshots/image.png");
  FileHandler.copy(temp, dest);
  
}
}
