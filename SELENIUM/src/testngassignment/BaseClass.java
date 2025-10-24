package testngassignment;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	HomePageDemoWeb hp;
	public static WebDriver driver;
	FileUtilityDemoWeb fu=new FileUtilityDemoWeb();
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(fu.getDataFromExcel("Sheet1", 1, 0));
	}
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException{
		LoginPageDemoWebPage lp=new LoginPageDemoWebPage(driver);
		lp.getLoginlink().click();

		lp.getEmailTextField().sendKeys(fu.getDataFromExcel("Sheet1", 1, 1));
		lp.getPasswordTextField().sendKeys(fu.getDataFromExcel("Sheet1", 1, 2));
		lp.getLoginButton().click();
	}
	
	@AfterMethod
	public void logout() {
		hp=new HomePageDemoWeb(driver);
		hp.getLogoutLink().click();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
