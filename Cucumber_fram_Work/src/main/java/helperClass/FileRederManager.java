package helperClass;

public class FileRederManager {
	
	public static ConfigurationManager cr;
	
	public static FileRederManager fr=new FileRederManager();
	
	public static FileRederManager getinstance() {
		
		return fr;
		
	}
	public static ConfigurationManager getcr() throws Throwable {
		
		if (cr == null) {
			cr=new ConfigurationManager();
		}
		return cr;
	}

}
