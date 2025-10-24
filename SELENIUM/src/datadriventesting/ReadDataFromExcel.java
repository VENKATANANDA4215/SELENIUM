package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./TestData/TestScriptData.xlsx");
	
	Workbook wb = WorkbookFactory.create(fis);
	
	String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();//String data
	System.out.println(url);
	
	String email = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();//String data
	System.out.println(email);
	
	String password = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();//String data
	System.out.println(password);
	
	double price = wb.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();//Number data
	System.out.println(price);
	
	boolean status = wb.getSheet("Sheet1").getRow(1).getCell(4).getBooleanCellValue();//boolean data
	System.out.println(status);
	LocalDateTime date = wb.getSheet("Sheet1").getRow(1).getCell(5).getLocalDateTimeCellValue();
	System.out.println(date.getDayOfMonth());
	System.out.println(date.getMonth());
	System.out.println(date.getYear());
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(url);
}
}
