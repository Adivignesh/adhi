package work_frame_Basce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basceClass {
	
	public static WebDriver driver;
	
	public static void getbrowser (String browser) {

		try {
			
		
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			}
		} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException();
	
}
}}