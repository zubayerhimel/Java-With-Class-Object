package Bank_Account_System;

public class Bank_Account {

	private String UserName;
	private String NationalID;
	private String Address;
	private String BankAccountID;
	private double InitialAmount;
	private double monthlyInterest;
	private double yearlyInterest;
	
	public Bank_Account(String username, String nationalid, String address, String bankaccountid, double amount)
	{
		UserName = username;
		NationalID = nationalid;
		Address = address;
		BankAccountID = bankaccountid;
		InitialAmount = amount;
	}
	
	public void depositeAmount(double amount)
	{
		InitialAmount += amount;
	}
	
	public void withdrawAmount(double amount)
	{
		if(InitialAmount > 100 && InitialAmount > amount)
		{
			InitialAmount -= amount;
		}
		else 
		{
			System.out.println("Sorry !! You are not eligible to withdraw money form account");
		}
	}
	
	public void MonthlyInterest()
	{
		if(InitialAmount > 100000)
		{
			monthlyInterest =  InitialAmount * .02;
		}
		else 
		{
			monthlyInterest = InitialAmount * .01;
		}
	}
	
	public void yearlyInterest()
	{
		yearlyInterest = monthlyInterest * 12;
	}
	
	public void displayAll()
	{
		System.out.println("Account holder name is  : "+UserName);
		System.out.println("Naitonal ID             : "+NationalID);
		System.out.println("Address                 : "+Address);
		System.out.println("Account number          : "+BankAccountID);
		System.out.println("Current amount          : "+InitialAmount);
		System.out.println("Monthly interest        : "+monthlyInterest);
		System.out.println("Yearly interest         : "+yearlyInterest);
	}
}
