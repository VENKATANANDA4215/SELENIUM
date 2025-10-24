package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetALLSelectOptions {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/dodda/Documents/S.Q.L/Cars.html");
		
		WebElement cars = driver.findElement(By.id("cars"));
		Select carssel=new Select(cars);
		
		carssel.selectByIndex(2);
		carssel.selectByIndex(1);
		carssel.selectByIndex(0);
		
		List<WebElement> allselectedoption = carssel.getAllSelectedOptions();
		System.out.println(allselectedoption.size());
		
		for(WebElement ele:allselectedoption)
		{
			System.out.println(ele.getText());
		}
		

}
}
