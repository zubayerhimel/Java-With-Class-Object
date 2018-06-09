
public class Owner extends Person{

	private String designation;
	private String companyName;
	
	public Owner()
	{
		
	}
	
	public void setOwnerdesignation()
	{
		designation = input.nextLine();
	}
	
	public void setOwnercompanyName()
	{
		companyName = input.nextLine();
	}
	
	public void printOwner()
	{
		System.out.println("Owner designation: "+designation);
		System.out.println("Owner company name: "+companyName);
	}
}
