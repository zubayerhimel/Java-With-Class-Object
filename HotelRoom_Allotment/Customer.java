package HotelRoom_Allotment;
import java.util.Scanner;
public class Customer {
	
	private String customerId;
	private String customerName;
	private String customerEmail;
	private String customerAddress;

	Scanner myscanner;
	
	public Customer()
	{
		myscanner = new Scanner(System.in);
	}
	
	public String getCustomerId()
	{
		return customerId;
	}
	
	public void inputAllInfoOfCustomer()
	{
		System.out.println("Enter customer id");
		customerId = myscanner.next();
		System.out.println("Enter customer name");
		myscanner.nextLine();
		customerName = myscanner.nextLine();
		System.out.println("Enter customer email");
		customerEmail = myscanner.nextLine();
		System.out.println("Enter customer address");
		customerAddress = myscanner.nextLine();
	}
	
	public void displayCustomerInfo()
	{
		System.out.println("Customer id       : "+customerId);
		System.out.println("Customer name     : "+customerName);
		System.out.println("Customer email    : "+customerEmail);
		System.out.println("Customer address  : "+customerAddress);
	}
	
}
