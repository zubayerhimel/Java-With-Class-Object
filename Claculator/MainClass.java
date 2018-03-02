package Claculator;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter your nusmber");
		int number = myScanner.nextInt();
		
		CalculatorClass obj = new CalculatorClass(number);
		
		String num = obj.isEvenOdd(number);
		System.out.println(num);
		
		myScanner.close();
	}
}
