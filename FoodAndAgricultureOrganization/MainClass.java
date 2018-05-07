package FoodAndAgricultureOrganization;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		System.out.println("Please enter country ID");
		int countryID = myscanner.nextInt();
		System.out.println("Please enter country name");
		String countryname = myscanner.next();
		System.out.println("Please enter country total Food Production");
		int totalfoodproduced = myscanner.nextInt();
		
		FoodClass obj = new FoodClass(countryID, countryname, totalfoodproduced);
		obj.display();
		obj.totalfoodproduction();
		
		myscanner.close();
	}

}
