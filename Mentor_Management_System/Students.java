package Mentor_Management_System;

public class Students extends Person{

	private int absent_days;
	private double cgpa;
	private double payable;
	private double paid;
	
	public Students()
	{
		super();
	}
	
	public void inputStudentsAdditionalInformation()
	{
		System.out.println("How many absent days?");
		absent_days = myscanner.nextInt();
		System.out.println("CGPA ");
		cgpa = myscanner.nextDouble();
		System.out.println("Payable amount of taka");
		payable = myscanner.nextDouble();
		System.out.println("Paid amount of taka");
		paid = myscanner.nextDouble();
	}
	
	public int getAbsentDays()
	{
		return absent_days;
	}
	
	public double getCGPA()
	{
		return cgpa;
	}
	
	public double getPayableAmount()
	{
		return payable;
	}
	
	public double getPaidAmount()
	{
		return paid;
	}
	
	public void displayStudentsInfo()
	{
		System.out.println("Student id             : "+getId());
		System.out.println("Student name           : "+getName());
		System.out.println("Student contact number : "+getContactNumber());
		System.out.println("Total absent days      : "+absent_days);
		System.out.println("Obtained CGPA          : "+cgpa);
		System.out.println("Payable amount         : "+payable);
		System.out.println("Paid amount            : "+paid);
	}
}
