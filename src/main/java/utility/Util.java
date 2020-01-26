package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class Util {

	public static Properties prop=new Properties();
	
	public static String getXpath(String className,String key) {
		String xpath = null;
		try {
			String fileName=System.getProperty("user.dir")+"/src/main/resources/"+className+".properties";
			FileInputStream fis=new FileInputStream(fileName);
			prop.load(fis);
			xpath=prop.getProperty(key);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return xpath;
	}
}
