public class Food {
	int f_id;
	String f_name;
	double unitprice;
	double sell_price;
	int total_food;
	double dailytotalsell = 0;
	int solditem =0;
	
	public void setvalue(int i, String n, double up, double sp, int tf)
	{
		f_id = i;
		f_name = n;
		unitprice = up;
		sell_price = sp;
		total_food = tf;
		
	}
	
	public void Display()
	{
		System.out.println("Food ID: " + f_id);
		System.out.println("Food name: " + f_name);
		System.out.println("Unit price of food: " + unitprice);
		System.out.println("Selling price of food: " + sell_price);
		System.out.println("Total food produced: " + total_food);
	}
	
	public void priceCalculation(int burger)
	{
		double totalprice=0;
		totalprice = burger*sell_price;
		System.out.println("your bill for " + burger+ f_name+ " is " +totalprice+" tk");
		dailytotalsell+=burger*sell_price;
		System.out.println("Your total sell is "  +dailytotalsell);
		solditem += burger;
		System.out.println("Total sold item is " + solditem);
		total_food-=burger;
		System.out.println("Remaining food is " + total_food);
	}
	
	public void profit()
	{
		double p = sell_price - unitprice;
		double benefit = p* solditem;
		System.out.println("Your profit is "+benefit+" tk");
	}

}
