package testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String getDataFromProperty(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./TestData/commondata.properties");
	Properties prop=new Properties();
	prop.load(fis);
	return prop.getProperty(key);
	
}
}
