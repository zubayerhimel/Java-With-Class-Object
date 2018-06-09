package Bank_Account_System;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		System.out.println("Please enter Account holder name");
		String name = myscanner.nextLine();
		System.out.println("National id");
		String id = myscanner.next();
		myscanner.nextLine();
		System.out.println("Address");
		String address = myscanner.nextLine();
		System.out.println("Account number ");
		String accID = myscanner.next();
		System.out.println("Initial amount");
		double amount = myscanner.nextDouble();
		
		Bank_Account obj = new Bank_Account(name, id, address, accID, amount);
		
		System.out.println("Deposite into account");
		double deposite = myscanner.nextDouble();
		obj.depositeAmount(deposite);
		System.out.println("Withdraw from the account ");
		double withdraw = myscanner.nextDouble();
		obj.withdrawAmount(withdraw);
		obj.MonthlyInterest();
		obj.yearlyInterest();
		obj.displayAll();
		
		myscanner.close();
	}

}
