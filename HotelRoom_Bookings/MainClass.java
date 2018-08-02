package HotelRoom_Bookings;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        // for suit room
        System.out.println("How many room?");
        int noOfRoom = myscanner.nextInt();
        SuitRoom suit[] = new SuitRoom[noOfRoom];
        String facility[] = null;
        for(int i=0; i<noOfRoom; i++)
        {
            suit[i] = new SuitRoom();
            suit[i].inputAll();
	            
	        System.out.print("How many extra facility?    : ");
	        int numOfFacility = myscanner.nextInt();
	        facility = new String[numOfFacility];
	        System.out.println("------- Input facility --------");
	
	        for (int j = 0; j < numOfFacility; j++) 
	        {
	            facility[j] = myscanner.next();
	        }
        }
        while (true) 
        {
	        Customer customer = new Customer();
	        System.out.println("Enter room number to book");
	        String number = myscanner.next();

	        for(int k=0; k<suit.length; k++)
	        {
	            if(number.equals(suit[k].getRoomNumber()))
	            {
		            if (suit[k].getCustomerId() == null) 
		            {
		                customer.inputCustomerInfo();
		                
		                System.out.println();
		                System.out.println("--------- Printing all information ---------");
		                // displaying customer info
		                System.out.println("Customer id         : " + customer.getId());
		                System.out.println("Customer name       : " + customer.getCustomerName());
		                System.out.println("Customer email      : " + customer.getCustomerEmail());
		                System.out.println("Cutomer address     : " + customer.getCustomerAddress());
		                System.out.println("Booking room number : " + suit[k].getRoomNumber());
		                System.out.println("Room bed number     : " + suit[k].getBedNumber());
		                System.out.println("Room size           : " + suit[k].getRoomSize());
		                System.out.println("Room rate           : " + suit[k].getRoomRate());
		                System.out.println("---- Extra facilities ----");
		                int count = 0;
		                for (String facility1 : facility) 
		                {
		                    System.out.println("Facility number " + (++count) + " : "+facility1);
		                }
		                suit[k].setCustomerId(customer.getId());
		            }
		            else
		            {
		                System.out.println("Sorry. The room is already being allocated by "+ customer.getCustomerName());
		            }
		        }
	            else
	            {
	            	System.out.println("Sorry!! The requested room is not exists.");
	            	break;
	            }
	        }
	        System.out.println("Type b to break the loop.");
            String br = myscanner.next();
            if (br.equalsIgnoreCase("b")) 
            {
                break;
            }
        }
        myscanner.close();
    }
}
