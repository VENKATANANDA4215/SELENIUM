package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toGetTittle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
	String title = driver.getTitle();
	System.out.println(title);
	
	if(title.equals("Instagram")) {
		System.out.println("user navigated to instagram");
	}
	else
	{
		System.out.println("user failed to navigate");
	}
	}

}
