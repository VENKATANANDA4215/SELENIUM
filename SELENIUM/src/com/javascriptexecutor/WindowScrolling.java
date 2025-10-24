package com.javascriptexecutor;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowScrolling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.abhibus.com/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//scrollTillbottom
		//js.executeScript("window.scrollBy(0,200)");
		//Thread.sleep(2000);
		//js.executeScript("window.scrollBy(0,2000)");	
		//js.executeScript("window.scrollTo(0,1000)");
		//Thread.sleep(2000);
		//js.executeScript("window.scrollTo(0,1000)");
		
	}

}
