package ABC_Factory;

public class Supervisor extends Person{

	public Supervisor()
	{
		super();
	}
	
	public boolean discountAvailability(int amount)
	{
		return amount >= 10000;
	}
	public void displaySupervisorInfo()
	{
		System.out.println("Supervisor id      : "+getPersonId());
		System.out.println("Supervisor name    : "+getPersonName());
		System.out.println("Supervisor address : "+getPersonAddress());
	}
}
