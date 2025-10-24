package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnWindowHandle {
	public static void main(String[] args) {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.instagram.com/");
	    
	    String windowID=driver.getWindowHandle();
	    System.out.println(windowID);
	}

}
