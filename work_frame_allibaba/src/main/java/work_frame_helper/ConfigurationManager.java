package work_frame_helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationManager {
	
	public static Properties aa;
	
	public ConfigurationManager() throws Throwable {

		aa=new Properties();
		
		File name=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\work_frame_Properties\\config.Properties");
		
		FileInputStream call=new FileInputStream(name);
		aa.load(call);
}
	public static String getbrowser() {
		String property = aa.getProperty("browser");
		return property;
	}
	public static String geturl() {
		String url = aa.getProperty("url"); 
		return url;
		
	}
}