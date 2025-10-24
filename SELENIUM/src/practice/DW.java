package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DW {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("FirstName")).sendKeys("Nanda");
		driver.findElement(By.id("LastName")).sendKeys("Doddaka");
		driver.findElement(By.id("Email")).sendKeys("doddakananda@1917gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Nanda@4215");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Nanda@4215");
		TakesScreenshot ts =(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("./Screenshots/img.png");
		FileHandler.copy(temp, dest);
	}

}
