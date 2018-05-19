package Product_sell;
import java.util.Scanner;
public class Product 
{
	private int id;
	private String Product_name;
	public double unitPrice;
	public double sellPrice;
	public int quantity;
	
	Scanner myscanner;
	
	public Product()
	{
		myscanner = new Scanner(System.in);
	}
	
	public void inputAll()
	{
		System.out.println("Enter product id:");
		id = myscanner.nextInt();
		System.out.println("Enter product name:");
		myscanner.nextLine();
		Product_name = myscanner.nextLine();
		System.out.println("Enter unit price of "+Product_name+":");
		unitPrice = myscanner.nextDouble();
		System.out.println("Enter selling price of "+Product_name);
		sellPrice = myscanner.nextDouble();
		System.out.println("Enter total amount of "+Product_name);
		quantity = myscanner.nextInt();
	}
	
	public double getUnitPrice()
	{
		return unitPrice;
	}
	
	public double getSellingPrice()
	{
		return sellPrice;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
}
