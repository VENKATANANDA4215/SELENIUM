package com.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGettext {
	public static void main(String[] args) {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   
	   driver.get("https://demowebshop.tricentis.com/login");
	   
	   driver.findElement(By.xpath("//input[@value='log in']")).click();
	   
	  String errorMsg = driver.findElement(By.xpath("//div[@class='validation-summary-erros']")).getText();
	   System.out.println(errorMsg);
	}

}
