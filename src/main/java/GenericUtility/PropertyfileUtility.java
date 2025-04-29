package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyfileUtility {
	public String readDataFromPropertyFile(String key) {
		Properties pobj=new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("./src/test/resources/config.properties");
			pobj.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String value=pobj.getProperty(key);
		return value;
	}

}
