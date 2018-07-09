package Tourism_Management_Company;

public class SummerPackage extends TourPackage{
	
	private String month;
	
	public SummerPackage()
	{
		super();
	}

	public void  inputMonthName()
	{
		System.out.println("Please enter month name");
		month = myscanner.next();
	}
	
	public String getMonthName()
	{
		return  month;
	}
}
