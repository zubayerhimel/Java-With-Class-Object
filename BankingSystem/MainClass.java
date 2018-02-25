package BankingSystem;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter customer name");
		String name = myScanner.nextLine();
		System.out.println("Enter customer account number");
		String account = myScanner.next();
		System.out.println("Balance");
		double amount = myScanner.nextDouble();
	
		
		Bank obj = new Bank(name, account,amount);
		obj.print();
		
		System.out.print("Please press 1 to deposite tk and 2 to withdraw tk");
		int p = myScanner.nextInt();
		if (p ==1)
		{
			System.out.println("How much tk do you want to deposite");
			double num = myScanner.nextDouble();
			obj.deposite(num);
			System.out.println("Your updated money is "+ obj.balance);
		}
		else if( p ==2 )
		{	
			System.out.println("How much tk do you want to withdraw");
			double num = myScanner.nextDouble();
			obj.withdraw(num);
			System.out.println("Your current amount is " +obj.balance);	
		}
		else 
		{
			System.out.println("Wrong choice");
		}
		
		myScanner.close();
	}
}
