package ABC_Store;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	Scanner myScanner = new Scanner(System.in);
	System.out.print("Enter salesman id: ");
	int id = myScanner.nextInt();
	System.out.print("Enter salesman name: ");
	String name = myScanner.next();
	
	StoreClass obj = new StoreClass(name, id);
	System.out.print("How much he is paid per day? ");
	int daySalary = myScanner.nextInt();
	double monthlyincome = obj.monthlySalary(daySalary);
	System.out.println("Monthly salary of "+name+ " is "+monthlyincome+" BDT.");
	System.out.print("How many product has he sold this month? ");
	int sellingProducts = myScanner.nextInt();
	double bonus = obj.bonus(sellingProducts);
	System.out.println("His bonus is "+bonus);
	System.out.println("His total salary of this month is "+(monthlyincome+bonus));
	
	myScanner.close();
}
}
