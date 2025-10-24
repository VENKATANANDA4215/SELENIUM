package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramAppl {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com");
		
		String text= driver.findElement(By.xpath("//input[@name='username']")).getAttribute("aria-label");
		
		System.out.println(text);
		Rectangle colour = driver.findElement(By.xpath("//button[@type='submit']")).getRect();
		
		System.out.println(colour.getHeight());
		System.out.println(colour.getWidth());
		System.out.println(colour.getX());
		System.out.println(colour.getY());
		
	}

}
