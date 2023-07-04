package frameWork.com;

public class RunnerClass extends BaseClass {
	

	public static void main(String[] args) {
		
		// without object creation using static keyword
		getbrowser();
		geturl1();
		
		int[] number = number();
		for (int i = 0; i < number.length; i++) 
			System.out.println(i); 
		
		// with creating the object..
		RunnerClass a=new RunnerClass();
		a.geturl();
		System.out.println("www.google,com");
		}
	
	
	
	}

