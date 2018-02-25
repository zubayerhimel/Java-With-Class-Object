package BDCompany;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter employee id: ");
		int id = myScanner.nextInt();
		System.out.print("Enter employee name: ");
		myScanner.nextLine();
		String name = myScanner.nextLine();
		System.out.print("Enter employee designation: ");
		String designation = myScanner.next();
		CompanyClass obj1 = new CompanyClass(id, name, designation);
		obj1.setSalary();
		System.out.println("Monthly Salary of "+obj1.designation+" is "+obj1.salary);
		obj1.yearlySalary();
		System.out.println("Yearly salary of " +obj1.designation+ " is "+ obj1.yearlySalary());
		obj1.bonus();
		System.out.println("Bonus is "+obj1.bonus());
		
		
		System.out.print("Enter employee id: ");
		id = myScanner.nextInt();
		System.out.print("Enter employee name: ");
		myScanner.nextLine();
		name = myScanner.nextLine();
		System.out.print("Enter employee designation: ");
		designation = myScanner.next();
		CompanyClass obj2 = new CompanyClass(id, name, designation);
		obj2.setSalary();
		System.out.print("Salary of "+obj2.designation+" is "+obj2.salary);
		
		
		myScanner.close();
	}
}
