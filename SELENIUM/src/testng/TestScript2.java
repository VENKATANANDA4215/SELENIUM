package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript2 extends BaseClass {
	@Test
	public void clickonelectronics()
	{
     driver.findElement(By.partialLinkText("ELECTRONICS")).click();
     if(driver.getTitle().equals("Demo Web Shop.Electronics"))
    	Reporter.log("Electronic page is displayed");
     else 
    	 Reporter.log("Electronic page is not  displayed");
          
	}

}
