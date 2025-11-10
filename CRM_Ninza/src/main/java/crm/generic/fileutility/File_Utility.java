package crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//This class has the methods to read and write the data from property file
public class File_Utility {
	//This method will read the data from property file 
	public String readDataFromPropertyFile(String Key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/Common_Data.properties.txt");
		Properties Pobj=new Properties();
		Pobj.load(fis);
		String value=Pobj.getProperty(Key);
		return value;
	}
	//This method will write the data to the property file
	public void writeDataToPropertyFile(String Key,String value) throws IOException
	{
		FileOutputStream fos=new FileOutputStream("./src/test/resources/Common_Data.properties.txt",true);
		Properties pobj=new Properties();
		pobj.setProperty(Key, value);
		pobj.store(fos, "Element is enabled");
	}
}
