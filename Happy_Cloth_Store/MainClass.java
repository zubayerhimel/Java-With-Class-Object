package Happy_Cloth_Store;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		System.out.println("How many shirts do you want?");
		int noOfShirt = myscanner.nextInt();
		System.out.println("How many jacket do you want?");
		int noOfJacket = myscanner.nextInt();
		
		Shop_Class shop = new Shop_Class();
		int unitPrice = shop.CalculateTotalUnitPrice(noOfShirt, noOfJacket);
		int salePrice = shop.CalculateTotalSalePrice(noOfShirt, noOfJacket);
		
		System.out.println("Total price  : "+salePrice);
		System.out.println("Tax          : "+shop.calculateTax(salePrice));
		System.out.println("Discount     : "+shop.calculateDiscount(salePrice));
		System.out.println("Final price  : "+(salePrice + shop.calculateTax(salePrice) - shop.calculateDiscount(salePrice)));
		System.out.println("Shop profit  : "+shop.calculateProfit(unitPrice, salePrice));
		
		
		myscanner.close();
	}

}
