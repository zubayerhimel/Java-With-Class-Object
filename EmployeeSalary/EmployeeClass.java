package EmployeeSalary;

public class EmployeeClass {

	private double salary;
	
	public double EmployeeSalary(String designation)
	{
		if(designation.equalsIgnoreCase("manager"))
		{
			getSalary(50000);
		}
		else 
		{
			getSalary(30000);
		}
		
		return setSalary();
	}
	
	public void getSalary(double salary)
	{
		this.salary = salary;
	}
	
	public double setSalary()
	{
		return salary;
	}
}
