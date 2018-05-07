package StudentGpa;

public class StudentClass {

	private String name;
	public double math;
	public double english;
	public double java;
	private double avg;
	private double gpa;
	
	public StudentClass(String name)
	{
		this.name = name;
	}
	
	public void calcualteavg(double math, double english, double java)
	{
		avg = (math+english+java)/3;
		
	}
	
	public void calcualtegpa()
	{
		if(avg > 40 && avg < 50)
		{
			gpa = 3.00;
		}
		else if(avg > 50 && avg< 80)
		{
			gpa = 3.50;
		}
		else if(avg > 80 && avg < 100)
		{
			gpa = 4.00;
		}
		else 
		{
			gpa = 0.00;
		}
	}
	
	public void display()
	{
		System.out.println("name: "+name);
		System.out.println("Avg: "+avg);
		System.out.println("Gpa: "+gpa);
	}
}
