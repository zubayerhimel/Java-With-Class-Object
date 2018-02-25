package StudentInformation;
import java.util.Scanner;
public class Main {

	public static void main(String args[])
	{
		Scanner  myScanner = new Scanner(System.in);
		System.out.print("Enter student name: ");
		String name = myScanner.nextLine();
		System.out.print("Enter student id: ");
		String id = myScanner.next();
		System.out.print("Enter department name: ");
		String department = myScanner.next();
		System.out.print("Enter semester name: ");
		String semester = myScanner.next();
		System.out.print("Enter student cgpa: ");
		int cgpa = myScanner.nextInt();
		System.out.print("Enter class number: ");
		int classnumber = myScanner.nextInt();
		
		sClass obj = new sClass(name, id, department, semester, cgpa, classnumber);
		
		obj.display();
		System.out.println("Monthly class occur: "+obj.monthlyClass());
		System.out.println("Yearly class occur: "+obj.yearlyClass());
		myScanner.close();
		
	}
}
