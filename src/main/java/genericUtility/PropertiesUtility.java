package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

	/**
	 * This is utility class which deals with properties file
	 * @omkar
	 * @vertion 26-03-26
	 */
public class PropertiesUtility {
	/**
	 * this is the generic method to fatch data from properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String getDataFromProperties(String key) throws IOException {
		FileInputStream fis=new FileInputStream(IPathutility.propertiespath);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}
	public void writeDataToExel(String key, String value, String comments) throws IOException {
		FileInputStream fis=new FileInputStream(IPathutility.propertiespath);
		Properties prop=new Properties();
		prop.load(fis);
		prop.setProperty(key, value);
		FileOutputStream fos=new FileOutputStream(IPathutility.propertiespath);
		prop.store(fos, comments);
		
		
	}
		
}
