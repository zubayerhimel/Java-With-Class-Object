package BDCompany;

public class CompanyClass {

	public int id;
	public String name;
	public String designation;
	public double salary;
	
	public CompanyClass(int id, String name, String designation)
	{
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	
	public void setSalary()
	{
		if(designation.equalsIgnoreCase("manager"))
		{
			salary = 20000;
		}
		else if (designation.equalsIgnoreCase("stuff"))
		{
			salary = 10000;
		}
	}
	
	public double yearlySalary()
	{
		return 12*salary;
	}
	
	public double bonus()
	{
		if(designation.equalsIgnoreCase("manager"))
		{
			return salary*.20;
		}
		else if (designation.equalsIgnoreCase("stuff"))
		{
			return salary*.05;
		}
		else {
			return 0;
		}
	}
	
	public void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Designation: "+ designation);
		System.out.println("Salary: "+salary);
	}
}
