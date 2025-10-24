package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectListBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/dodda/Documents/S.Q.L/Cars.html");
		
		WebElement cars = driver.findElement(By.id("cars"));
		Select carsele=new Select(cars);
		
		carsele.selectByIndex(0);
		carsele.selectByValue("C");
		carsele.selectByVisibleText("Benz");
		
		Thread.sleep(2000);
		
		carsele.deselectAll();
		System.out.println(carsele.isMultiple());
		
	}

}
