package Hotel_SeaCrown;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		
		Scanner myscanner = new Scanner(System.in);
		Customer customer = new Customer();
		customer.rentRoom();
		
		System.out.println("Which room do you want? \n1. Deluxe room\n2. Standard room");
		int select = myscanner.nextInt();
		if(select == 1)
		{
			// deluxe room
			DeluxeRoom deluxe = new DeluxeRoom();
			deluxe.inputAll();
			deluxe.inputRoomSize();
			System.out.println("Thank you");
		}
		else if(select == 2)
		{
			// standard room
			StandardRoom standard = new StandardRoom();
			standard.inputAll();
			standard.isACAvailable();
			System.out.println("Thank you");
		}
		else 
		{
			System.out.println("No room selected");
		}
	}
}
