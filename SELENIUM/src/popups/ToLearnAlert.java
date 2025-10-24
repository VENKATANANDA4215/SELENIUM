package popups;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearnAlert {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(2000);
		Alert popup = driver.switchTo().alert();
	    System.out.println(popup.getText());
	    popup.accept();
	    TakesScreenshot ts=(TakesScreenshot) driver;
	    File temp = ts.getScreenshotAs(OutputType.FILE);
	    File dest=new File("./Screenshots/img.png");
	    FileHandler.copy(temp, dest);
	} 
}
