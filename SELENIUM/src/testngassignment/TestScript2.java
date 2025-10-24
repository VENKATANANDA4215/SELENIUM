package testngassignment;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript2 extends BaseClass {
	
	FileUtilityDemoWeb fu=new FileUtilityDemoWeb();
	@Test
	public void clickOnComputers() throws EncryptedDocumentException, IOException{
		HomePageDemoWeb hp=new HomePageDemoWeb(driver);
		hp.getComputerLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers","Computers page is not  Displayed");
		Reporter.log("Computers page is Displayed");
		
		

		/*if(driver.getTitle().equals(fu.getDataFromExcel("Sheet2", 1, 1))) {
			Reporter.log("Computers page is Displayed",true);
		}
		else {
			Reporter.log("Computers page is not Displayed",true);
		}*/
	}

}
