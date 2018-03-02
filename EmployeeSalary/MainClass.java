package EmployeeSalary;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter employee designation");
		String designation = myScanner.next();
		
		EmployeeClass obj = new EmployeeClass();
		double salary = obj.EmployeeSalary(designation);
		System.out.println("Salary is "+salary);
		
		myScanner.close();
	}
}
