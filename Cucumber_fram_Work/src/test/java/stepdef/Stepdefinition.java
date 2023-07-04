package stepdef;

import baseClass.baseclass;
import helperClass.FileRederManager;

public class Stepdefinition extends baseclass {
	
//	private static String browser;

	public static void main(String[] args) throws Throwable{
		
		String browser = FileRederManager.getinstance().getcr().getBrowser();
		
		
		System.out.println(browser);
		getbrowser(browser);
	}

}
