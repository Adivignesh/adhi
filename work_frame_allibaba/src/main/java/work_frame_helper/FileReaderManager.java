package work_frame_helper;

public class FileReaderManager {
	
	public static ConfigurationManager cr;
	
	public static FileReaderManager fr = new FileReaderManager();
	
	public static FileReaderManager getinstance() {
		return fr;
	}
	public static  ConfigurationManager getcr() throws Throwable {
		if (cr==null) {
			
			cr=new  ConfigurationManager();
		}
		return cr;
		
	}
	

}
