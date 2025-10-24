package testngassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageDemoWeb {
	@FindBy(linkText  = "BOOKS")
	private WebElement booksLinks;
	
	
	@FindBy(linkText =  "Computers")
	private WebElement computerLink;
	
	@FindBy(linkText =  "Electronics")
	private WebElement electronicsLink;
	
	@FindBy(linkText = "Gift Cards")
	private WebElement giftcardsLink;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
    
	
	public HomePageDemoWeb(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getBooksLink() {
		return booksLinks;
	}

	public WebElement getComputerLink() {
		return computerLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}
	
	public WebElement getGiftcards() {
		return giftcardsLink;
	}
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	
	

}
