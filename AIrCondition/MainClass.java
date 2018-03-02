package AIrCondition;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter the condition of todays weather");
		String weather = myScanner.next();
		
		TempratureClass obj = new TempratureClass();
		obj.ACTemperature(weather);
		double acControl = obj.ACTemperature(weather);
		System.out.println("Air condition temperature for today should be "+acControl);
		
		myScanner.close();
	}
}
