package work_frame_StepDefinition;

import work_frame_Basce.basceClass;
import work_frame_helper.FileReaderManager;

public class StepDefinitionManager extends basceClass {
	
	public static void main(String[] args) throws Throwable {
		String getbrowser = FileReaderManager.getinstance().getcr().getbrowser();
		
		
		getbrowser(getbrowser);
	}


}
