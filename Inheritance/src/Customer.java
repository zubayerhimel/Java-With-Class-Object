
public class Customer extends Person{

	private String customerType;
	private String purchaseItem;
	
	public Customer()
	{
		
	}
	
	public void setCustomerType()
	{
		customerType = input.nextLine();
	}
	
	public void  setPurchaseItem()
	{
		purchaseItem = input.nextLine();
	}
	
	public void printCustomer()
	{
		System.out.println("Customer type is: "+customerType);
		System.out.println("Customer purchased item is: "+purchaseItem);
	}
}
