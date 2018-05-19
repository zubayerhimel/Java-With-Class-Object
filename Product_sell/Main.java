package Product_sell;

public class Main {
	
	public static void main(String[] args) {
		
		Product pro[] = new Product[5];
		
		// making object of Product class
		
		for(int i=0; i<2; i++)
		{
			pro[i] = new Product();
		}
		
		// initializing object 
		
		for(int i=0; i<2; i++)
		{
			System.out.println("Input "+i+ " product");
			pro[i].inputAll();
		}
		
	    // total quantity
		
		int quan = 0;
		for(int i=0; i<2; i++)
		{
			quan+=pro[i].quantity;
		}
		
		// total cost
		
		double cost = 0.0;
		for(int i=0; i<2; i++)
		{
			cost+= pro[i].unitPrice*pro[i].quantity;
		}
		
		// total selling 
		double sell = 0.0;
		for(int i=0; i<2; i++)
		{
			sell+= pro[i].sellPrice*pro[i].quantity;
		}
		
		// total benefit 
		
		double benefit = cost-sell; 
		
		
		
		System.out.println("Total quantity is "+quan);
		System.out.println("Total cost is "+cost);
		System.out.println("Total sell "+sell);
		System.out.println("Benefit "+benefit);
	}
}
