package ABC_Factory;
import java.util.Scanner;
public class Order {

	private String orderId;
	private String orderName;
	private double orderPrice;
	private int orderAmount;
	
	Scanner myscanner;
	
	public Order()
	{
		myscanner = new Scanner(System.in);
	}
	
	public void inputOrderInfo()
	{
		System.out.println("Please enter order id");
		orderId = myscanner.next();
		System.out.println("Please enter order name");
		orderName = myscanner.next();
		System.out.println("Please enter order price");
		orderPrice = myscanner.nextDouble();
		System.out.println("Please enter order amount");
		orderAmount = myscanner.nextInt();
		if(orderAmount >= 5000)
		{
			System.out.println("Order placed successfully");
		}
		else
		{
			System.out.println("Sorry!! Minimum order requirement is 5000");
			System.exit(0);
		}
	}
	
	
	public void displayOrderInfo()
	{
		System.out.println("Order id         : "+orderId);
		System.out.println("Order name       : "+orderName);
		System.out.println("Order price      : "+orderPrice);
		System.out.println("Order amount     : "+orderAmount);
	}
	
	public double getOrderPrice()
	{
		return orderPrice;
	}
	
	public int getOrderAmount()
	{
		return orderAmount;
	}
	
}
