package Hotel_SeaCrown;
import java.util.Scanner;
public class Customer extends Room{

	public String customerID;
	private String customerName;
	
	Scanner myscanner;
	
	public Customer()
	{
		myscanner = new Scanner(System.in);
	}
	
	public void rentRoom()
	{
		System.out.println("Please enter customer name");
		customerName = myscanner.next();
	}
	
}
