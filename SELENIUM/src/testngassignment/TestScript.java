package testngassignment;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass{
	
	FileUtilityDemoWeb fu=new FileUtilityDemoWeb();
	@Test
	public void clickOnBooks() throws EncryptedDocumentException, IOException{
		HomePageDemoWeb hp=new HomePageDemoWeb(driver);
		hp.getBooksLink().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books", "Books page is not Displayed");
		Reporter.log("Books page is Displayed");
		
		
		
	
		/*if(driver.getTitle().equals(fu.getDataFromExcel("Sheet2", 1, 0))) {
			
			Reporter.log("Books page is Displayed",true);
		}
		else {
			Reporter.log("Books page is not Displayed",true);
		}*/
		
	}
}
