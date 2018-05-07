package Uber_Fair;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Please enter travel distance");
		double traveldistance = myscanner.nextDouble();
		System.out.println("Please enter price per kilometer");
		double priceperkilometer = myscanner.nextDouble();
		System.out.println("Is discount promotion active or not?");
		String promotiondiscount = myscanner.next();
		
		UberClass obj = new UberClass(traveldistance, priceperkilometer, promotiondiscount);
		obj.calculatefair();
		
		myscanner.close();
	}
}
