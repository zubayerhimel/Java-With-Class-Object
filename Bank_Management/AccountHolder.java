package Bank_Management;
import java.util.Scanner;

public class AccountHolder {

	private String accountHolderName;
	private double currentBalance;
	private double dipositeAmount;
	private double withdrawAmount;
	private double loanAmount;
	private double interestAmount;
	
	Scanner myscanner;
	
	public AccountHolder()
	{
		myscanner = new Scanner(System.in);	
	}
	
	public void inputAll()
	{
		System.out.println("Please enter account holder name");
		accountHolderName = myscanner.nextLine();
		System.out.println("Please enter account balance of "+accountHolderName);
		currentBalance = myscanner.nextDouble();
		dipositeAmount = 0.0;
		withdrawAmount = 0.0;
		loanAmount = 0.0;
		interestAmount = 0.0;
	}
	
	public void DepositeMoney()
	{
		try 
		{
			System.out.println("Enter your deposition amount");
			dipositeAmount = myscanner.nextDouble();
			currentBalance+=dipositeAmount;
		} catch (NumberFormatException e) 
		{
			System.out.println("Please enter double number.");
		}
	}
	
	public void WithdrawMoney()
	{
		try 
		{
			System.out.println("Enter your withdrawing amount");
			withdrawAmount = myscanner.nextDouble();
			if(currentBalance>=withdrawAmount)
			{
				currentBalance -= withdrawAmount;
			}
			else 
			{
				System.out.println("Sorry!! your current amount is "+currentBalance+" . You must have 500.0 tk in your account for getting loan");
			}
		} catch (NumberFormatException e) 
		{
			System.out.println("Please enter double number");
		}
	}
	
	public boolean isEligibleForLoan()
	{
		return currentBalance>500.0;
	}
	
	public void LoanMoney()
	{
		if(isEligibleForLoan())
		{
			try 
			{
				System.out.println("Please enter loan amount");
				loanAmount = myscanner.nextDouble();
				currentBalance+=loanAmount;
				
			} catch (NumberFormatException e) 
			{
				System.out.println("Please enter double number");
			}
		}
	}
	
	public void calculateInterest()
	{
		interestAmount+= (currentBalance*.10);
		currentBalance += interestAmount;
		System.out.println("After 10% intereset total amount is "+currentBalance);
	}
	
	public double getCurrentBalance()
	{
		return currentBalance;
	}
	
}
