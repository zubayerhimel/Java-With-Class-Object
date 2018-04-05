package Cricketer;

import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) {
		
		Scanner myscanner = new Scanner(System.in);
		System.out.println("Enter the player name: ");
		String name = myscanner.nextLine();
		System.out.println("Enter age of the player: ");
		int age = myscanner.nextInt();
		myscanner.nextLine();
		System.out.println("Enter the country of the player: ");
		String country = myscanner.nextLine();
		
		Controller obj = new Controller(name,age,country);
		
		System.out.println("Enter run of the player: ");
		int run = myscanner.nextInt();
		obj.increasingRun(run);
		System.out.println("Enter total wicket: ");
		int wicket = myscanner.nextInt();
		obj.increasingwicket(wicket);
		System.out.println("Enter total match played: ");
		int match = myscanner.nextInt();
		obj.increasingmatch(match);
		
		obj.printinfo();
		
		myscanner.close();
				
	}
}
