package testng;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
       public static  WebDriver driver;
             @BeforeClass
       public void openbrowser()
       {
    	   driver=new ChromeDriver();
    	   driver.manage().window().maximize();
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	   
    	   driver.get("https://demowebshop.tricentis.com/");
       }
       @BeforeMethod
       public void login()
       {
    	   driver.findElement(By.linkText("Log in")).click();
    	   driver.findElement(By.id("Email")).sendKeys("doddakananda1919@gmail.com");
    	   driver.findElement(By.id("Password")).sendKeys("Nanda@4215");
    	   driver.findElement(By.xpath("//input[@value='Log in']"));
       }
       @AfterMethod
       public void logout()
       {
    	   driver.findElement(By.linkText("Log out")).click();
    	   
       }
    @AfterClass
    public void closebrowser()
    {
      driver.quit();
    }
}
