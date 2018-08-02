package Mentor_V2;
import java.util.Scanner;
public class PersonClass implements PersonInterface{

	private int id;
	private String name;
	private String contact_no;
	
	Scanner myscanner;
	public PersonClass()
	{
		myscanner = new Scanner(System.in);
	}
	
	@Override
	public void inputPersonInfo()
	{
		System.out.print("Enter id             : ");
		id = myscanner.nextInt();
		myscanner.nextLine();
		System.out.print("Enter name           : ");
		name = myscanner.nextLine();
		System.out.print("Enter contact number : ");
		contact_no = myscanner.next();
	}
	
	@Override
	public int getId()
	{
		return id;
	}
	
	@Override
	public String getName()
	{
		return name;
	}
	
	@Override
	public String getContactNumber()
	{
		return contact_no;
	}
}

