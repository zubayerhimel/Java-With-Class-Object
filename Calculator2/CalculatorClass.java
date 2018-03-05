package Calculator2;

public class CalculatorClass {

	private int number;
	
	public CalculatorClass(int number) {
	
		this.number = number;
	}
	
	public boolean isEvenOrOdd()
	{
		return number%2==0;
	}
	
	public void printer()
	{
		System.out.println(isEvenOrOdd()? "The number is Even": "The number is odd");
	}
	public int adder()
	{
		int a = isEvenOrOdd()? 1000:2000;
		return a+=number;
	}
}
