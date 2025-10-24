package popups;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FresherWorld {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.freshersworld.com/");
		driver.findElement(By.id("reg_new_btn")).click();
		driver.findElement(By.id("file-upload")).sendKeys("C:\\\\Users\\\\dodda\\\\Documents\\\\MY DOCUMENTS\\\\VenkataNanda.D.pdf");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/fresher.png");
		FileHandler.copy(temp, dest);
		
		
	}

}
