package Bank_Management;

public class Accountant extends Employee{

final private double bonus = 0.03;
	
	public Accountant()
	{
		
	}
	
	public void calculateSalaryOfAccountant(double allAccountAmount)
	{
		salary = fixedSalary+ honourableBonus + eidBonus + (allAccountAmount*bonus);
		System.out.println("Manager Salary "+salary+" tk");
	}
}
