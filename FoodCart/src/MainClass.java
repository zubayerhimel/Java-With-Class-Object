import java.util.Scanner;
import java.util.Arrays;
public class MainClass {
static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,8,9,10,14,15,16,17,18,19,20,25,26,27,29};
		
		System.out.println("Enter your number");
		int search = myScanner.nextInt();
		
		System.out.print(search + " is found at index "+ (Arrays.binarySearch(arr, search)+1));
		
	}

}
