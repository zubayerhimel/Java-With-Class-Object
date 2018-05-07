package VTS_House_Holding;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner myscanner = new Scanner(System.in);
		System.out.println("Enter Manager id");
		int id = myscanner.nextInt();
		System.out.println("Enter Manager name");
		String name = myscanner.next();
		System.out.println("Enter Project investment");
		int investment = myscanner.nextInt();
		
		Manager obj = new Manager(id, name, investment);
		
		try 
		{
			System.out.println("Enter brick cost");
			int brick = myscanner.nextInt();
			System.out.println("Enter cement cost");
			int cement = myscanner.nextInt();
			
			obj.total_Cost(brick, cement);
			
		} catch (InputMismatchException e) 
		{
			System.out.println("Please enter an integer number");
		} 
			
		obj.profit_calculation();
		obj.save_ProfitCalculation();
		obj.display();
		
		
		myscanner.close();
	}
}
