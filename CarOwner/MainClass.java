package CarOwner;

import java.util.Scanner;

public class MainClass {

public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter car manufacturer name");
		String manuName = myScanner.next();
		myScanner.nextLine();
		System.out.println("Enter car owner name");
		String ownerName = myScanner.nextLine();
		System.out.println("Enter price of the car");
		int price = myScanner.nextInt();
		
		CarOwner obj = new CarOwner(manuName, ownerName, price);
		
		obj.display();
		
		myScanner.close();
	}
}
