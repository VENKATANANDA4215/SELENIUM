package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {
	public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  driver.get("https://www.facebook.com/r.php?entry_point=login");
	  
	  WebElement monthDropdown = driver.findElement(By.id("month"));
	  WebElement yearDropdown = driver.findElement(By.id("year"));
	  WebElement dayDropdown = driver.findElement(By.id("day"));
	  
	  
	  
	 Select monthSelect=new Select(monthDropdown);
	 monthSelect.selectByVisibleText("Oct");
	 
	 Select year=new Select(yearDropdown);
	 year.selectByVisibleText("1947");
	 
	 Select day=new Select(dayDropdown);
	 day.selectByVisibleText("15");
	 
	 System.out.println(monthSelect.isMultiple());
	 
	 
	 
	// monthSelect.selectByIndex(4);
	// monthSelect.selectByValue("4");
	 //monthSelect.selectByVisibleText("Aug");
	 
	}

}
