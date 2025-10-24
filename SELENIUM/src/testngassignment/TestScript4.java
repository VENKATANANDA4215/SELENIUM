package testngassignment;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript4 extends BaseClass{
	
	FileUtilityDemoWeb fu=new FileUtilityDemoWeb();
	@Test
	public void clickOnGiftcards() throws EncryptedDocumentException, IOException  {
		HomePageDemoWeb hp=new HomePageDemoWeb(driver);
		hp.getGiftcards().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Gift Cards","Giftcards page is not Displayed");
		Reporter.log("Giftcards page is  Displayed");
		
		

		
		
		
		/*if(driver.getTitle().equals(fu.getDataFromExcel("Sheet2", 1, 3))) {
			Reporter.log("Giftcards page is Displayed",true);
		}
		else {
			Reporter.log("Giftcards page is not Displayed",true);
		}*/
	}

}
