import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		Food f = new Food();
		
		System.out.print("Enter food id: ");
		int id = myScanner.nextInt();
		System.out.print("Enter food name: ");
		String name = myScanner.next();
		System.out.print("Enter unitprice: ");
		double up = myScanner.nextDouble();
		System.out.print("Enter selling price of "+name+" : ");
		double sp = myScanner.nextDouble();
		System.out.print("Total "+name+" made: ");
		int tf = myScanner.nextInt();
		
		
		f.setvalue(id, name, up, sp, tf);
		System.out.println("\n\nHow many times you want to do the loop?");
		int limit = myScanner.nextInt();
		int i=0,burger=0;
		
		while(i!=limit)
		{
		System.out.println("\nHow many " +name+" do you want?");
	    burger = myScanner.nextInt();
		f.priceCalculation(burger);
		i++;
		}
		
		System.out.println("Do you want to see the profit? press y for yes and n for no");
		char command = myScanner.next().charAt(0);
		if (command == 'y')
		{
			f.profit();
		}
		else 
		{
			System.exit(0);
		}
		
		
		myScanner.close();
	}
}
