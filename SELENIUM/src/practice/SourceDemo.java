package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SourceDemo {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		FileInputStream fis =new FileInputStream("./TestData/commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String passord = prop.getProperty("password");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("URL");
		driver.findElement(By.id("user-name")).sendKeys("doddakananda1919@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Nanda@4215");
		
		
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("Email"));
		driver.findElement(By.id("Password"));
		
		
		
		
	}

}
