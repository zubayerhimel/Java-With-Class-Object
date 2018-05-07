package FoodAndAgricultureOrganization;

public class FoodClass {

	private int countryID;
	private String countryname;
	private double totalfoodproduced;
	
	public FoodClass(int countryID, String countryname, double totalfoodproduced)
	{
		this.countryID = countryID;
		this.countryname = countryname;
		this.totalfoodproduced = totalfoodproduced;
	}
	
	
	public void totalfoodproduction()
	{
		if(totalfoodproduced >50 && totalfoodproduced <500)
		{
			System.out.println("The country doesn't need any suport from FAO");
		}
		else 
		{
			System.out.println("Country need FAO support for Food Production");
		}
	}
	
	public void display()
	{
		System.out.println("Country ID: "+countryID);
		System.out.println("Country name: "+countryname);
	}
}
