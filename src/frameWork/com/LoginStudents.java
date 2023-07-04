package frameWork.com;

import java.util.Scanner;

public class LoginStudents {

	public static void main(String[] args) {
		DataEntiry a=new DataEntiry();
		System.out.println("enter the name");
		
		 Scanner ab = new Scanner(System.in);
			a.setName(ab.nextLine());
		
		System.out.println(a.getName()+" login sucessfully");
		 
	
	}

}
