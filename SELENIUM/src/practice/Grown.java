package practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grown {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://groww.in/calculators/fd-calculator");	
			WebElement slider = driver.findElement(By.xpath("(//div[@role='slider'])[1]"));
			Actions act=new Actions(driver);
			act.dragAndDropBy(slider, 0, 0).perform();
			
			driver.findElement(By.xpath("//div[text()='Time period']/div")).click();
			
			WebElement month = driver.findElement(By.id("FD_TIME_IN_MONTHS"));
			month.clear();
			month.sendKeys("2");
			Thread.sleep(3000);
			String returns = driver.findElement(By.xpath("//td[text()='Est. returns']/..//span")).getText();
			System.out.println(returns);
			returns=returns.replace(",", "");
			int estReturn = Integer.parseInt(returns);
			if (estReturn>10000) {
				System.out.println("Deposit");
			}else {
				System.out.println("withdraw");
			}
		}
	}
