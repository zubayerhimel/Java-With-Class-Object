package NASA_Project;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter total budget of NASA");
		double budget = myScanner.nextInt();
		
		ProjectClass obj = new ProjectClass(budget);
		
		System.out.println("Enter cost for Project gemini");
		int pg = myScanner.nextInt();
		System.out.println("Enter cost for viking program");
		int vg = myScanner.nextInt();
		
		obj.TotalCost(pg, vg);
		
		myScanner.close();
	}

}
