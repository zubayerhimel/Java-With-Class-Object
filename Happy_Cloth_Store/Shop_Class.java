package Happy_Cloth_Store;

public class Shop_Class {

	
	public int totalAmountOfUnitPrice;
	public int totalAmountOfSalePrice;
	
	public Shop_Class()
	{
		
	}
	
	public int CalculateTotalUnitPrice(int amountOftshirt, int amountOfjacket)
	{
		totalAmountOfUnitPrice = (400 * amountOftshirt) + (600 * amountOfjacket);
		return totalAmountOfUnitPrice;
	}
	
	public int CalculateTotalSalePrice(int amountOftShirt, int amountOfJacket)
	{
		totalAmountOfSalePrice = (500 * amountOftShirt) + (800 * amountOfJacket);  
		
		return totalAmountOfSalePrice;
	}
	
	public double calculateTax(int price)
	{
		return price * .04;
	}
	
	public double calculateDiscount(int price)
	{
		if(price > 3000)
		{
			return price * .05;
		}
		else
		{
			return 0.0;
		}
	}
	
	public int calculateProfit(int unitPrice, int salePrice)
	{
		return salePrice - unitPrice;
	}
}
