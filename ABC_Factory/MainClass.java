package ABC_Factory;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		// supervisor info
		System.out.println("How many supervisor?");
		int noOfsupervisor = myscanner.nextInt();
		Supervisor sup[] = new Supervisor[noOfsupervisor];
		for (int i = 0; i < noOfsupervisor; i++) {
			sup[i] = new Supervisor();
			sup[i].inputPersonInfo();
			System.out.println();
		}

		// display all supervisor
		for (int i = 0; i < sup.length; i++) {
			sup[i].displaySupervisorInfo();
			System.out.println();
		}

		// placing order
		while (true) 
		{
			System.out.println("------------ Customer information ----------");
			Client client = new Client();
			client.inputPersonInfo();
			client.inputClientsType();
			if (client.getClientType().equalsIgnoreCase("registered")) 
			{
				System.out.println("How many order do you want to place?");
				int noOfOrder = myscanner.nextInt();
				Order order[] = new Order[noOfOrder];
				for (int j = 0; j < noOfOrder; j++) 
				{
					order[j] = new Order();
					order[j].inputOrderInfo();
					System.out.println();
				}

				// display all order
				double price = 0.0;
				int orderAmount = 0;
				for (int j = 0; j < order.length; j++) 
				{
					order[j].displayOrderInfo();
					price += order[j].getOrderPrice() * order[j].getOrderAmount();
					orderAmount += order[j].getOrderAmount();
					System.out.println();
				}
				
				client.displayClientsInfo(price);
				client.calculateDiscount(orderAmount, price);
			}
			else
			{
				System.out.println("Sorry!! You are not a registerd customer.");
				break;
			}
			
			System.out.println("Do you want to break? [y/n]");
			String option = myscanner.next();
			if(option.contains("y"))
			{
				break;
			}
			
			myscanner.close();
		}
		
	}
}
