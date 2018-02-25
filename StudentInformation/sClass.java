package StudentInformation;

public class sClass {

	String  name;
	String id;
	String department;
	String semester;
	int cgpa;
	int classnumber;

	public sClass(String name, String id, String department, String semester, int cgpa, int classnumber)
	{
		this.name = name;
		this.id = id;
		this.department = department;
		this.semester = semester;
		this.cgpa = cgpa;
		this.classnumber = classnumber;
	}
	
	public int monthlyClass()
	{
		return classnumber*4;
	}
	
	public int yearlyClass()
	{
		return classnumber*52;
	}
	
	public void display()
	{
		System.out.println("Student name: "+name);
		System.out.println("Student id: "+id);
		System.out.println("Department name: "+department);
		System.out.println("Current semester name: "+semester);
		System.out.println("Student cgpa: "+cgpa);
		System.out.println("Class per week: "+classnumber);
	}
}
