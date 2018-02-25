package BankingSystem;
public class Bank {

	String name;
	String account;
	double balance;
	
	public Bank(String name, String account, double balance)
	{
		this.name = name;
		this.account = account;
		this.balance = balance;
	}
	
	
	public void print()
	{
		System.out.println("Customer name: "+ name);
		System.out.println("Account number: "+ account);
		System.out.println("Balance: "+balance);
	}
	
	public double withdraw(double amount)
	{
		return balance-=amount;
	}
	
	public double deposite(double amount)
	{
		return balance += amount;
	}
	
	

}
