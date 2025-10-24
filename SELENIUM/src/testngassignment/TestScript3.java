package testngassignment;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript3 extends BaseClass {
	
	FileUtilityDemoWeb fu=new FileUtilityDemoWeb();
	@Test
	public void clickOnElectronics() throws EncryptedDocumentException, IOException {
		HomePageDemoWeb hp=new HomePageDemoWeb(driver);
		hp.getElectronicsLink().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers","Electronics page is not Displayed");
		Reporter.log("Electronics page is Displayed");
		
		
		
		
		
		/*if(driver.getTitle().equals(fu.getDataFromExcel("Sheet2", 1, 2))) {
			Reporter.log("Electronics page is Displayed",true);
		}
		else {
			Reporter.log("Electronics page is not Displayed",true);
		}*/
	}
	

}
