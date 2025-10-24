package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAxes {
public static void main(String[] args) {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("file:///C:/Users/dodda/Documents/S.Q.L/MovieTable.html");
	    
	   String collection = driver.findElement(By.xpath("//td[text()='KGF']/following-sibling::td[1]")).getText();
	   System.out.println(collection);
	   
	   String imdb = driver.findElement(By.xpath("//td[text()='Dragon']/following-sibling::td[1]")).getText();
	   System.out.println(imdb);
	

	  // String moviename = driver.findElement(By.xpath("//td[text()='Chaava']")).getText();
	   //System.out.println(moviename);
	   
	   
	   String pos = driver.findElement(By.xpath("//td[text()='KGF']/preceding-sibling::td[1]")).getText();
	   System.out.println(pos);

	   
	    String movie="KGF";
		driver.findElement(By.xpath("//td[text()='"+movie+"']/following-sibling::td[1]")).getText();
	   System.out.println(collection);

	   
	   
}
}
