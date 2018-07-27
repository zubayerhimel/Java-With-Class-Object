package Mentor_Management_System;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		
		Scanner myscanner = new Scanner(System.in);
		
		Advisor advisor = new Advisor();
		
		// getting all advisor information.
		
			advisor.inputAll();
		
		
		// displaying all advisor
		System.out.println("------- Advisor Info --------");
		
		advisor.displayAdvisorInfo();
		
		
		// assigning students for advisor
		
			System.out.println("How many students to assign?");
			int numberOfStudents = myscanner.nextInt();
			if(numberOfStudents > 40)
			{
				System.out.println("Students limit exceeds!!");
			}
			else
			{
				Students students[] = new Students[numberOfStudents];
				for(int j=0; j<numberOfStudents; j++)
				{
					students[j] = new Students();
					students[j].inputAll();
					students[j].inputStudentsAdditionalInformation();
					students[j].displayStudentsInfo();
					System.out.println("Total due : "+ (students[j].getPayableAmount() - students[j].getPaidAmount()));
					
				}
				
				for(int i=0; i<students.length; i++)
				{
					if(students[i].getAbsentDays() > 10)
					{
						System.out.println("Absent students id : "+students[i].getId());
						System.out.println("Absent students name : "+students[i].getName());
						
					}
					if(students[i].getCGPA() < 3.00)
					{
						System.out.println("low cgpa : "+ students[i].getName());
					}
				}
				
			}
		
	}

}
