import java.util.Scanner;
public class MainClass {

	static Scanner myScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		Course obj = new Course();     //creating an object named obj of the Course class
		Course obj1 = new Course();       // creating another object named obj1 of the course class
		
		System.out.println("Enter the course code");            // getting values from the user
		String code = myScanner.next();            
		myScanner.nextLine();
		System.out.println("Enter the course name");
		String name = myScanner.nextLine();
		System.out.println("Enter the course teacher name");
		String cname = myScanner.nextLine();
		System.out.println("Enter course credit");
		Integer credit = myScanner.nextInt();
		System.out.println("Total class done in a week");
		Integer totalclass = myScanner.nextInt();
		
		
		obj.setValue(code, name, cname, credit, totalclass);   // setting the value in the obj object from the keyboard
		
		obj1.setValue("SWE231", "Algorithm", "DAA", 4, 5);    // set the value in the obj1 object
		
		
		obj.Display();
		obj.weeklyclass();
		obj.monthlyclass();
		obj.yearlyclass();
	}
}
