package CarOwner;

public class CarOwner {

	private String carName;
	private String ownerName;
	private int price;
	
	public CarOwner(String carName, String ownerName, int price) {
	
		this.carName = carName;
		this.ownerName = ownerName;
		this.price = price;
	}
	
	public void display()
	{
		System.out.println("Car name is "+carName);
		System.out.println("Car owner name is "+ownerName);
		System.out.println("Price of the car is "+price);
	}
}
