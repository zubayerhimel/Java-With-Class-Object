
package StudentGpa;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		
		Scanner myscanner = new Scanner(System.in);
		System.out.println("Name: ");
		String name = myscanner.next();
		StudentClass obj = new StudentClass(name);
		System.out.println("math: ");
		double math = myscanner.nextDouble();
		System.out.println("English: ");
		double english= myscanner.nextDouble();
		System.out.println("Java: ");
		double java = myscanner.nextDouble();
		
		obj.calcualteavg(math, english, java);
		obj.calcualtegpa();
		obj.display();
		myscanner.close();
	}
}
