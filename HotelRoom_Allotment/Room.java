package HotelRoom_Allotment;
import java.util.Scanner;
public class Room {
	
	private String roomNumber;
	private int noOfBeds;
	private double roomRate;
	private String roomSize;
	private String customerNumber = null;
	  
	String facilities[];
	protected Scanner myscanner;
	
	public Room()
	{
	    myscanner = new Scanner(System.in);
    }
	
	public void inputAllInfoAboutBasicRoom()
	{
		System.out.println("Enter room number");
		roomNumber = myscanner.next();
		System.out.println("Enter number of beds of the room");
		noOfBeds = myscanner.nextInt();
		System.out.println("Enter the rate of the room");
		roomRate = myscanner.nextDouble();
		System.out.println("Enter room size (sqr ft)");
		roomSize = myscanner.next();
	}
	
	public void inputFacilitiesOfARoom(int noOffacilities)
	{
		System.out.println("Input facilities of the selected room");
		facilities = new String[noOffacilities];
		for(int i=0; i<noOffacilities; i++)
		{
			System.out.println("Facilities number "+i);		
			facilities[i] = myscanner.next();
		}
	}
	
	public void printFacilities()
	{
		System.out.println("Facilities for room");
		for(int i=0; i<facilities.length; i++)
		{
			System.out.println("Faciity: "+facilities[i]);
		}
	}
	
	public void setCustomerIdForTheRoom(String customerId)
	{
		customerNumber = customerId;
	}
	
	public boolean roomAvailability()
	{
		if(customerNumber == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void displayRoomInfo()
	{
		System.out.println("------- Information --------");
		System.out.println("Room number : "+roomNumber);
		System.out.println("Number of beds of the room : "+noOfBeds);
		System.out.println("Room rate : "+roomRate);
		System.out.println("Room size (sqr ft) : "+roomSize);
		System.out.println("Customer number of the allocated room : "+customerNumber);
	}
}
