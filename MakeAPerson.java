import Person.*;
import java.util.Scanner;

public class MakeAPerson {
	
	public static void main (String [] args) {
	
	String fName;
	String lName;
	int a;
	char s;
	
	Scanner inputDevice=new Scanner(System.in); 
		
	Person man = new Person();	
	// man.setFirstN(fName);
	// man.setSex(s);
	// man.setLastN(lName);
	// man.setAge(a);
	
	System.out.println("\n\tHello! Let's make a new person!\n"+
	"What is the sex of the person?");
	//s=inputDevice.next().charAt;
	man.setSex(inputDevice.next().charAt(0));
	
	// Scanner c = new Scanner(System.in);
	// // s=inputDevice.next();
	// // char c = s.charAt(0);
	// char ch = c.next().charAt(0);
	
	System.out.println("\nWhat is the age of the person?");
	man.setAge(inputDevice.nextInt());
	inputDevice.nextLine();
	
	System.out.println("\nWhat is the first name of the person?");
	man.setFirstN(inputDevice.nextLine());	
	
	System.out.println("\nWhat is the last name of the person?");
	man.setLastN (inputDevice.nextLine());	
	
	String info = man.getPersonInfo();
	System.out.println(info);
	
	}
}