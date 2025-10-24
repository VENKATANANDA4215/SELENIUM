package com.locator.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnId {
public static void main(String[] args) {
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login");
		
		driver.findElement(By.id("email")).sendKeys("doddakananda1919@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Nanda@1234");
		
		driver.findElement(By.id("loginbutton")).click();
}
}
}
