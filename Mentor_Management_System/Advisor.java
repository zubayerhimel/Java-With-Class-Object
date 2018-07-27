package Mentor_Management_System;

public class Advisor extends Person{

	public static Students[] students;

	private int no_of_student;
	
	
	public Advisor()
	{
		super();
	}
	
	public void setNoOfStudent(int student)
	{
		this.no_of_student = student;
	}
	
	public int getNoOfStudent()
	{
		return no_of_student;
	}
	
	public void displayAdvisorInfo()
	{
		System.out.println("Advisor id             : "+getId());
		System.out.println("Advisor name           : "+getName());
		System.out.println("Advisor contact number : "+getContactNumber());	
	}
}
