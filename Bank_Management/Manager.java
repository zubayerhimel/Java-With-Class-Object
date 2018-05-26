package Bank_Management;

public class Manager extends Employee{

	final private double bonus = 0.07;
	
	public Manager()
	{
		
	}
	
	public void calculateSalaryOfManager(double allAccountAmount)
	{
		salary = fixedSalary+ honourableBonus + eidBonus + (allAccountAmount*bonus);
		System.out.println("Manager Salary "+salary+" tk");
	}
}
