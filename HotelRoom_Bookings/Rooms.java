package HotelRoom_Bookings;

import java.util.Scanner;

public class Rooms implements RoomInterface{

    private String roomNumber;
    private int numberOfBed;
    private double roomsize;
    private double rate;
    private String customerId = null;
    
    Scanner myscanner;
    
    Customer customer = new Customer();
    
    public Rooms()
    {
        myscanner = new Scanner(System.in);
    }
    
    /**
     *
     */
    @Override
    public void inputAll()
    {
        System.out.println("------- Input Room Information ------");
        System.out.print("Enter room number     : ");
        roomNumber = myscanner.next();
        System.out.print("Enter number of beds  : ");
        numberOfBed = myscanner.nextInt();
        System.out.print("Enter room size(sqr)  : ");
        roomsize = myscanner.nextDouble();
        System.out.print("Enter room rate(tk)   : ");
        rate = myscanner.nextDouble();
                
    }
    
    @Override
    public String getRoomNumber()
    {
        return roomNumber;
    }
    
    @Override
    public int getBedNumber()
    {
        return numberOfBed;
    }
    
    @Override
    public double getRoomSize()
    {
        return roomsize;
    }
    
    @Override
    public double getRoomRate()
    {
        return rate;
    }
    
    @Override
    public void setCustomerId(String id)
    {
        customerId = id;
    }
    
    @Override
    public String getCustomerId()
    {
        return customerId;
    }
    
}
