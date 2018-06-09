import java.util.Scanner;

public class Person {
	
	private String name;
	private String age;
	private String address;
	private String phoneNumber;
	
	Scanner input;
	
	public Person()
	{
		input = new Scanner(System.in);
	}
	
	
	public void setName()
	{
		name = input.nextLine();
	}
	
	public void setAge()
	{
		age = input.nextLine();
	}
	
	public void setAddress()
	{
		address = input.nextLine();
	}
	
	public void setPhonenumber()
	{
		phoneNumber = input.nextLine();
	}
	
	public void pirntPerson()
	{
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Address is: "+address);
		System.out.println("Phone number is: "+phoneNumber);
	}

}
