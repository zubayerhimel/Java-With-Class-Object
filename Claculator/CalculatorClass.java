package Claculator;

public class CalculatorClass {

	private int number;
	
	public CalculatorClass(int number) {
	
		this.number = number;
	}
	
	public String isEvenOdd(int number)
	{
		String a;
		if(number%2==0)
		{
			a = "Even";
		}
		else 
		{
		    a = "Odd";
		}
		Value(a);
		return a;
	}
	
	public void Value(String a)
	{
		if(a.equalsIgnoreCase("even"))
		{
			System.out.println((number+=10000));
		}
		else 
		{
			System.out.println((number+=20000));
		}
		
	}
}
