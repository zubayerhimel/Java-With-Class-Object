package VTS_House_Holding;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class Manager {

	private int id;
	private String name;
	private int investment;
	private int totalCost;
	private int totalProfit;
	
	
	public Manager(int id, String name, int investment)
	{
		this.id = id;
		this.name = name;
		this.investment = investment;
	}
	
	public void total_Cost(int brick, int cement)
	{
		totalCost = brick+cement;
	}
	
	public void profit_calculation()
	{
		totalProfit = investment - totalCost;
	}
	
	public void save_ProfitCalculation()
	{
		try 
		{
			
			File file = new File("Profit.txt");
			FileWriter filewriter = new FileWriter(file);
			filewriter.write("\r"+totalProfit);
			filewriter.close();
			
		} catch (Exception e) {

			System.out.println("File Not Found");
		}
	}
	
	public void check_ProfitCalculation()
	{
		try 
		{
			File file = new File("Profit.txt");
			Scanner sc = new Scanner(file);
			String str = null;
			double profit = 0;
			while(sc.hasNextLine())
			{
				str = sc.next();
				
			}
			profit = Integer.parseInt(str);
			
			if(profit > 10000)
			{
				System.out.println("Change your policies");
			}
			else 
			{
				System.out.println("Profit is :"+profit);
			}
			
			sc.close();
		} catch (Exception e) {

			System.out.println("File Not Found");
		}
	}
	
	public void display()
	{
		System.out.println("Manager id: "+ id);
		System.out.println("Manager name: "+name);
		System.out.println("Total investment: "+investment);
		System.out.println("Total cost: "+totalCost);
		check_ProfitCalculation();
	}
}
