package randomassignement;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip {
	    public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        try {
	            driver.get("https://www.flipkart.com");
	            /*WebElement searchBox = driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
	            searchBox.sendKeys("iPhone");
	            WebElement searchIcon = driver.findElement(By.cssSelector("button[type='submit']"));
	            searchIcon.click();*/
	            driver.findElement(By.xpath("//input[@type=\'text\']")).sendKeys("iphone17");
	        	driver.findElement(By.xpath("//button[@type='submit']")).click();
	            WebElement firstProduct = driver.findElement(By.xpath("//div[contains(@class, 'product') and contains(@class, 'free-delivery')]"));
	            firstProduct.click();
	            String originalWindow = driver.getWindowHandle();
	            Set<String> allWindows = driver.getWindowHandles();
	            for (String window : allWindows) {
	                if (!window.equals(originalWindow)) {
	                    driver.switchTo().window(window);
	                    break;
	                }
	            }
	            WebElement compareCheckbox = driver.findElement(By.xpath("//input[@type='checkbox' and @name='compare']"));
	            compareCheckbox.click();
	            Thread.sleep(2000);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


