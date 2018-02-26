package CricketerPrizeMoney;
import java.util.Scanner;

public class MainClass {
	
public static void main(String[] args) {
	Scanner myScanner = new Scanner(System.in);
	System.out.print("Enter player name: ");
	String name = myScanner.next();
	System.out.print("Enter age: ");
	int age = myScanner.nextInt();
	
	PlayerClass obj = new PlayerClass(name, age);
	System.out.print("How many matches "+name+" has played? ");
	int match = myScanner.nextInt();
	System.out.print("How much prize money will he get from one match: ");
	int prizemoney = myScanner.nextInt();
	double money = obj.PrizeMoney(match, prizemoney);
	obj.bonusMoney(match);
	obj.display();
	System.out.println(name+" got paid "+ money+" BDT for "+match+" matches.");
	
	myScanner.close();
}
}
