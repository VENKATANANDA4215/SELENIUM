package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWebshopAssignment {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx"); 
	WebElement CountryDropDown = driver.findElement(By.id("country"));
	WebElement StateDropdown = driver.findElement(By.id("state"));
 
	
   Select country =new Select(CountryDropDown);
   country.selectByVisibleText("USA");
   
   Select state =new Select(StateDropdown);
   state.selectByVisibleText("Washington");
   
}
}
