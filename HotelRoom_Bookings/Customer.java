package HotelRoom_Bookings;

import java.util.Scanner;

public class Customer implements CustomerInterface{

    private String customerId = null;
    private String customerName;
    private String customerEmail;
    private String customerAddress;
    
    Scanner myscanner;
    
    public Customer()
    {
        myscanner = new Scanner(System.in);
    }
    
    @Override
    public void inputCustomerInfo()
    {
        System.out.println("------ Input Customer Information ------");
        System.out.print("Please enter customer id      : ");
        customerId = myscanner.next();
        System.out.print("Please enter customer name    : ");
        myscanner.nextLine();
        customerName = myscanner.nextLine();
        System.out.print("Please enter customer email   : ");
        customerEmail = myscanner.next();
        System.out.print("Please enter customer address : ");
        myscanner.nextLine();
        customerAddress = myscanner.nextLine();
    }
    
    @Override
    public String getId()
    {
        return customerId;
    }    
    
    @Override
    public String getCustomerName()
    {
        return customerName;
    }
    
    @Override
    public String getCustomerEmail()
    {
        return customerEmail;
    }
    
    @Override
    public String getCustomerAddress()
    {
        return customerAddress;
    }
}
