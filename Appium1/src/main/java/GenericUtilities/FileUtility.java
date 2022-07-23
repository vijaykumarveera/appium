package GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author vijaykumar v
 *
 */
public class FileUtility 
{
	/**
	 * its is used get common data from property file based on the key which you have specified as a arguments
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyKeyValue(String key) throws IOException
	{
		FileInputStream fileInputStream =  new FileInputStream("./src/test/resources/CommonData.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		String value = properties.getProperty(key);
		return value;
	}
}
