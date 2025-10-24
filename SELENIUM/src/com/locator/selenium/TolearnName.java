package com.locator.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnName {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.instagram.com/accounts/login/");
	    Thread.sleep(200);
	    
	    driver.findElement(By.name("username")).sendKeys("6281556053");
	    
	    driver.findElement(By.name("password")).sendKeys("421520000");
	}

}
