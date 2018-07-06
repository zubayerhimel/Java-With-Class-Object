package Meena_Bazar;

public class Salesman extends Person{

	public Salesman()
	{
		super();
	}
	
	public void displaySalesmanInfo()
	{
		System.out.println("Salesman Id : "+getPersonId());
		System.out.println("Salesman name : "+getPersonName());
	}
}
