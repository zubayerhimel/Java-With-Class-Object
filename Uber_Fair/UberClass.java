package Uber_Fair;

public class UberClass {

	private double traveldistance;
	private double priceperkilometer;
	private String promotiondiscount;
	
	public UberClass(double traveldistance, double priceperkilometer, String promotiondiscount)
	{
		this.traveldistance = traveldistance;
		this.priceperkilometer = priceperkilometer;
		this.promotiondiscount = promotiondiscount;
	}
	
	public void calculatefair()
	{
		double amount;
		if(promotiondiscount.equalsIgnoreCase("active"))
		{
			amount = (traveldistance*priceperkilometer);
			amount-=(amount*.10);
		}
		else
		{
			amount = (traveldistance*priceperkilometer);
		}
		
		System.out.println("Total fair is "+ amount);
	}
}
