package helperClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationManager {
	
	public static Properties ps; //global Variable
	
	public ConfigurationManager() throws Throwable {
		
		ps=new Properties();
	
	    
	File name= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
		
	FileInputStream fis=new FileInputStream(name);
	
	    ps.load(fis);
	}    
 
	public static String getBrowser() {
		String browser = ps.getProperty("browser");
		System.out.println(browser);
		return browser;
	
	}
	public static String geturl() {
		String url = ps.getProperty("url");
		return url;
		
	}
	
}