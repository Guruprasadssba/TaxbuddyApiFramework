package api.GenericUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility 
{
	/**
	 *   its used return the value from the property file based on key
	 * @param key
	 * @return value
	 * @throws Throwable
	 */
	public String getPropertyKeyValue(String key) 
	{
		try
		{
			FileInputStream fis = new FileInputStream(Iconstants.PropertyFilePath);
			Properties pObj = new Properties();
			pObj.load(fis);
			String value = pObj.getProperty(key);
			return value;
		}
		catch(Throwable e)
		{
			System.out.println("handled");
		}
		return key;
	}
}
