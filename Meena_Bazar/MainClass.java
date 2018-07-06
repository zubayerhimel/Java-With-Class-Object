package Meena_Bazar;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		
		// salesman info
		System.out.println("\n\tSales man info");
		System.out.println("How many salesman?");
		int noOfSalesman = myscanner.nextInt();
		Salesman salesman[] = new Salesman[noOfSalesman];  // making class array
		for(int j=0; j < noOfSalesman; j++)
		{
			salesman[j] = new Salesman(); // new class for each salesman
			salesman[j].inputPersonInfo();
			salesman[j].displaySalesmanInfo();
		}
		
		
		// product info
		System.out.println("\n\tProduct info");
		System.out.println("How many products do you want to input?");
		int noOfProducts = myscanner.nextInt();
		Product product[] = new Product[noOfProducts]; // making class array
		int count =0;
		for(int i=0; i < noOfProducts; i++)
		{
			System.out.println("Product serial index "+(++count));
			product[i] = new Product(); // making new class for each product
			product[i].inputProductInfo();
		}
		
		// Customer info
		System.out.println("\n\tCustomer info");
		System.out.println("How many customer do you want to register?");
		int noOfCustomer = myscanner.nextInt();
		Customer customer[] = new Customer[noOfCustomer];  // making class array
		for(int c = 0; c < noOfCustomer; c++)
		{
			customer[c] = new Customer();  // making new class for each customer
			customer[c].inputPersonInfo();
			customer[c].setTypeOfCustomer(); // set customer type for later 
		}
		
		while(true)
		{
			// displaying product
			for(int i = 0; i < product.length; i++)
			{
				product[i].displayProductInfo();
			}
			
			System.out.println("Which product do you want to buy? (give product id)");
			String productId = myscanner.next();
			int indexOfProduct = -1; // assigning indexOfProduct variable to -1 as the loop starts from 0.
			
			for (int p = 0; p < product.length; ++p) 
			{
                if (product[p].getProductId().equals(productId)) // check if the product id is available or not 
                {
                    indexOfProduct = p; // if product id is available then the id will be assigned to indexOfProduct variable. 
                    break; // break the loop
                }
		    }
			
			if(product[indexOfProduct].getRemainingAmount() > 0) // check if the selected product is sufficient or not
			{
				System.out.println("How much do you want?");
				int qunatity = myscanner.nextInt();
				if(product[indexOfProduct].productAvailability(qunatity)) // if the quantity does not exceed remaining amount of product 
				{
					System.out.println("Please input customer id");
					String customer_id = myscanner.next();
					int indexOfCustomer = -1;
					
					for(int q = 0; q < customer.length; q++)
					{
						if(customer[q].getPersonId().equals(customer_id))
						{
							indexOfCustomer = q;
							break;
						}
					}
					if(indexOfCustomer == -1) // if the customer is not registered then this message will show up.
					{
						System.out.println("Sorry !! The customer is not registered.");
					}
					else
					{
						customer[indexOfCustomer].displayCustomerInfo(product[indexOfProduct].getPrice() * qunatity); // else selected customer will buy selected product.
					}
				}
				else
				{
					System.out.println("Sorry!! The requested product is out of stock"); // if the quantity exceeds then this message will show up
				}
			}
			else
			{
				System.out.println("Sorry!! The product is not currently unavailable"); // if the product is not found then this message will show up
			}
				
			System.out.println("Do you want to break? type yes to break"); // taking request to buy another one product
			String option = myscanner.next();
			if(option.equalsIgnoreCase("yes"))
			{
				break;
			}
		}
		
		myscanner.close(); // closing scanner
	}
}
