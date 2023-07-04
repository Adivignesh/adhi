package baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	
	public static WebDriver driver;
	
	public static  void getbrowser(String browser) {
		
		try {
			if (browser.equals("chrome")){
				WebDriverManager.chromedriver().setup();
				
				driver= new ChromeDriver();
				
			}
			else if (browser.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver= new EdgeDriver();
				
			}else if (browser.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
			}
			else if (browser.equals("ie")) {
				WebDriverManager.iedriver().setup();
				driver= new InternetExplorerDriver();
				
			}
			
			driver.manage().window().maximize();
	//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

}
