public class Staff extends Person{

	private String designation;
	private String salary;
	private String companyName;
	
	public Staff()
	{
		
	}
	
	public void setDesignation()
	{
		designation = input.nextLine();
	}
	
	public void setSalary()
	{
		salary = input.nextLine();
	}
	
	public void setCompanyname()
	{
		companyName  = input.nextLine();
	}
	
	public void printStaff()
	{
		System.out.println("Designation is: "+designation);
		System.out.println("Salary is: "+salary);
		System.out.println("Company name is: "+companyName);
	}
}
