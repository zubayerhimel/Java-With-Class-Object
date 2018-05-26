package Bank_Management;
import java.util.Scanner;

public class Employee {

	private String employeeName;
	private int age;
	public double salary;
	final public double fixedSalary = 8000.0;
	public double eidBonus;
	public double honourableBonus;
	
	Scanner myscanner;
	
	public Employee()
	{
		myscanner = new Scanner(System.in);
	}
	
	public void inputEmployeeInfo()
	{
		System.out.println("Please enter employee name");
		employeeName = myscanner.nextLine();
		System.out.println("Please enter employee age");
		age = myscanner.nextInt();
		System.out.println("Employee fixed salary is  "+fixedSalary+ " tk");
		salary = 0.0;
		eidBonus = 0.0;
		honourableBonus = 0.0;
	}
	
	public double getEidBonus()
	{
		System.out.println("Please enter eid bonus of the employee");
		return eidBonus = myscanner.nextDouble();
	}
	
	public double getHonourableBonus()
	{
		System.out.println("Please enter honourable bonus of the employee");
		return honourableBonus = myscanner.nextDouble();
	}
	
}
