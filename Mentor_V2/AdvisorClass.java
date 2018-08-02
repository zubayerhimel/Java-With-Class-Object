package Mentor_V2;

public class AdvisorClass extends PersonClass implements AdvisorInterface{

	private int noOfStudents;
	
	public StudentClass student = new StudentClass();
	
	public AdvisorClass()
	{
		super();
	}
	
	@Override
	public boolean addStudent()
	{
		noOfStudents = noOfStudents + 1;
		if(noOfStudents <= 40)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public void displayAdvisorInfo()
	{
		System.out.println("Advisor id             : "+getId());
		System.out.println("Advisor name           : "+getName());
		System.out.println("Advisor contact number : "+getContactNumber());
	}
}
