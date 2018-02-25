package ClothStore;

public class ClothClass {

	int tshirt = 500;
	int jacket = 200;
	double finalcost;
	
	public void Cost(int shirt, int jac)
	{
		int s = shirt*tshirt;
		int j = jac*jacket;
		
		int cost = s+j;
		System.out.println("Total cost is "+ cost);
		double tax = (double) cost*.02;
		System.out.println("Tax is : " +tax);
		finalcost = tax+cost;
		System.out.println("Final cost with tax is "+finalcost);
	}
	
	public double discount()
	{
		if(finalcost>3000)
		{
			return finalcost*.20;
		}
		else 
		{
			return 0;
		}
	}
}
