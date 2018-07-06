package ABC_Factory;
import java.util.Scanner;
public class Person {

	private String personId;
	private String personName;
	private String personAddress;
	
	Scanner myscanner;
	
	public Person()
	{
		myscanner = new Scanner(System.in);
	}
	
	public void inputPersonInfo()
	{
		System.out.println("Please enter person id");
		personId = myscanner.next();
		System.out.println("Please enter person name");
		myscanner.nextLine();
		personName = myscanner.nextLine();
		System.out.println("Please enter person address");
		personAddress = myscanner.nextLine();
	}
	
	public String getPersonId()
	{
		return personId;
	}
	
	public String getPersonName()
	{
		return personName;
	}
	
	public String getPersonAddress()
	{
		return personAddress;
	}
}
