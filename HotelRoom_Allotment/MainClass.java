package HotelRoom_Allotment;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		
		Scanner myscanner = new Scanner(System.in);
		System.out.println("\n\t\tWELCOME TO HAMBI TAMBI HOTEL\n");
		System.out.println("Which type of room do you want?");
		String typeOfRoom = myscanner.nextLine();
		Customer customer[] = new Customer[100];
		
		while(true)
		{
			if(typeOfRoom.equalsIgnoreCase("standard"))
			{
				Standard_room sRoom = new Standard_room();
				sRoom.inputAllInfoAboutBasicRoom();
				System.out.println("How many extra facilities?");
				int extraFacilities = myscanner.nextInt();
				sRoom.inputFacilitiesOfARoom(extraFacilities);
				
				if(sRoom.roomAvailability())
				{
					int i = 0;
					customer[i] = new Customer();
					customer[i].inputAllInfoOfCustomer();
					sRoom.setCustomerIdForTheRoom(customer[i].getCustomerId());
					
					sRoom.displayRoomInfo();
					sRoom.printFacilities();
					customer[i].displayCustomerInfo();
				}
				else 
				{
					System.out.println("Sorry!! your requested standard type room is already booked.");
				}
			}
			else if(typeOfRoom.equalsIgnoreCase("family"))
			{
				Family_room fRoom = new Family_room();
				fRoom.inputAllInfoAboutBasicRoom();
				System.out.println("How many extra facilities?");
				int extraFacilities = myscanner.nextInt();
				fRoom.inputFacilitiesOfARoom(extraFacilities);
				
				if(fRoom.roomAvailability())
				{
					int i = 0;
					customer[i++] = new Customer();
					customer[i].inputAllInfoOfCustomer();
					fRoom.setCustomerIdForTheRoom(customer[i].getCustomerId());
					
					fRoom.displayRoomInfo();
					fRoom.printFacilities();
					customer[i].displayCustomerInfo();
				}
				else 
				{
					System.out.println("Sorry!! your requested family type room is already booked.");
				}
			}
			else 
			{
				Deluxe_room dRoom = new Deluxe_room();
				dRoom.inputAllInfoAboutBasicRoom();
				System.out.println("How many extra facilities?");
				int extraFacilities = myscanner.nextInt();
				dRoom.inputFacilitiesOfARoom(extraFacilities);
				
				if(dRoom.roomAvailability())
				{
					int i = 0;
					customer[i++] = new Customer();
					customer[i].inputAllInfoOfCustomer();
					dRoom.setCustomerIdForTheRoom(customer[i].getCustomerId());
					
					dRoom.displayRoomInfo();
					dRoom.printFacilities();
					customer[i].displayCustomerInfo();
				}
				else 
				{
					System.out.println("Sorry!! your requested deluxe type room is already booked.");
				}
			}
			
			System.out.println("Want to stop? type 'yes' to stop");
			String option = myscanner.next();
			if(option.equalsIgnoreCase("yes"))
			{
				break;
			}
		}
		myscanner.close();
	}
}
