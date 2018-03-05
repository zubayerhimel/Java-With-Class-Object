package Calculator2;

public class MainClass {

	public static void main(String[] args) {
		
		CalculatorClass obj = new CalculatorClass(25);
		obj.printer();
		System.out.println(obj.adder());
	}
}
