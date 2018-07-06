package ABC_Factory;

public class Client extends Person{

	private String clientsType;
	private double discount;
	
	Supervisor sup = new Supervisor();
	public Client()
	{
		super();
	}
	
	public void inputClientsType()
	{
		System.out.println("Enter client type [registered / unregistered]");
		clientsType = myscanner.next();
	}
	
	public String getClientType()
	{
		return clientsType;
	}
	
	
	// calculate tax 
	public double calculateTax(double price)
	{
		return price * .05;
	}
	
	// calculate discount
	public void calculateDiscount(int amount, double bill)
	{
		if(sup.discountAvailability(amount))
		{
			discount = amount * .10;
		}
		else
		{
			discount = 0.0;
		}
	}
	
	
	// display clients billing info
	public void displayClientsInfo(double bill)
	{
		System.out.println("Clients id       : "+getPersonId());
		System.out.println("Clients name     : "+getPersonName());
		System.out.println("Clients address  : "+getPersonAddress());
		System.out.println("Clients type     : "+ clientsType);
		System.out.println("Total amount     : "+ bill);
		System.out.println("Tax              : "+calculateTax(bill));
		System.out.println("Discount         : "+discount);
		System.out.println("Final amount     : "+ (bill + calculateTax(bill) - discount));
	}
}
