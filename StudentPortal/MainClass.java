package StudentPortal;
import java.util.Scanner;

public class MainClass {

	static Scanner myScanner = new Scanner(System.in);
	static StudentClass std = new StudentClass();
	
	public static void main(String[] args) {
		
		System.out.print("press\n1. Registration/ Log In\n2. Live result\n3. Result\n4. Payment\n\nEnter:: ");
		int option = myScanner.nextInt();
		if(option == 1)
		{
			LoginRegister();
		}
		else if(option == 2)
		{
			lResult();
		}
		else if(option == 3)
		{
			Finalresult();
		}
		else 
		{
			payment();
		}
		
	}
	
	public static void LoginRegister()
	{
		System.out.print("Please log in or register. press--\n1. Register\n2. Log in\n\nEnter:: ");
		int option = myScanner.nextInt();
		switch (option) {
		case 1:
			setValues();
			break;
		case 2:
			System.out.print("Enter id: ");
			String id = myScanner.next();
			System.out.print("Password: ");
			String pass = myScanner.next();
			
			std.login(id, pass);
			break;
			
		default:
			break;
		}
	}
	
	public static void setValues()
	{
		System.out.print("Name: ");
		myScanner.nextLine();
		String name = myScanner.nextLine();
		System.out.print("Id: ");
		String id = myScanner.next();
		System.out.print("Password: ");
		String pass = myScanner.next();
		System.out.print("Phone number: ");
		String phonenumber = myScanner.next();
	    System.out.print("Mail address: ");
	    myScanner.nextLine();
	    String mail = myScanner.nextLine();
	    
	    std.register(name, id, pass, phonenumber, mail);
	    main(null);
	}
	
	public static void lResult()
	{
		System.out.print("Please enter first quiz number: ");
		double firstquiz = myScanner.nextDouble();
		System.out.print("Second quiz number: ");
		double secondquiz = myScanner.nextDouble();
		System.out.print("Third quiz number: ");
		double thirdquiz = myScanner.nextDouble();
		
		double average = std.CalculateAvg(firstquiz,secondquiz,thirdquiz);
		System.out.println("your quiz average is "+average);
	}
	public static void Finalresult()
	{
		System.out.print("Press\n1. Calculate subject GPA\n2. Calculate semester CGPA\nEnter:: ");
		int option = myScanner.nextInt();
		if(option ==1)
		{
	    System.out.print("Enter subject name: ");
	    myScanner.nextLine();
	    String subjectname = myScanner.nextLine();
		System.out.print("Enter quiz marks: ");
		double quizmarks = myScanner.nextDouble();
		System.out.print("Enter mid exam marks: ");
		double midmarks = myScanner.nextDouble();
		System.out.print("Enter final exam marks: ");
		double finalmarks = myScanner.nextDouble();
		System.out.print("Enter assignment marks: ");
		double assignmentmarks = myScanner.nextDouble();
		System.out.print("Enter lab marks: ");
		double labmarks = myScanner.nextDouble();
		System.out.print("Enter attendence marks: ");
		double attendencemarks = myScanner.nextDouble();
		
		FinalResult obj = new FinalResult(subjectname,quizmarks, midmarks, finalmarks, assignmentmarks, labmarks, attendencemarks);
		obj.SubjectGPa();
		}
		else if(option == 2)
		{
			System.out.println("How many subjects??");
			int numberOfSubject = myScanner.nextInt();
			int sum =0, cgpa =0;
			for(int i=0; i<numberOfSubject; i++)
			{
				System.out.print("Enter subject name: ");
				myScanner.nextLine();
				String name = myScanner.nextLine();
				System.out.print("Enter credit of "+name+": ");
				int credit = myScanner.nextInt();
				System.out.print("Enter grade point: ");
				double grade = myScanner.nextDouble(); 
				
				sum+=credit;
				cgpa +=(credit*grade);
				System.out.println("");
			}
			
			System.out.println("\nSemester CGPA is: " + (cgpa/sum));
		}
	}
	
	public static void payment()
	{
		System.out.print("Enter total fees of the semester: ");
		double semesterFees = myScanner.nextDouble();
		System.out.print("Enter percentage of waver (if has): ");
		double waver = myScanner.nextDouble();
		
		semesterFees-= (semesterFees*(waver/100));
		
		System.out.println("Your semester fees is: "+semesterFees);
		
	}
}
