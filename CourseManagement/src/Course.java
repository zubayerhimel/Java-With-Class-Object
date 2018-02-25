public class Course {

	String course_code;
	String course_name;
	String course_teacher;
	Integer credit;
	Integer total_class;
	
	public void setValue(String code, String name, String teacher, Integer credit, Integer tc)
	{
		course_code = code;
		course_name = name;
		course_teacher = teacher;
		this.credit = credit;
		total_class = tc;
	}
	
	public void Display()
	{
		System.out.println("Course code: " +course_code);
		System.out.println("Course name: "+ course_name);
		System.out.println("Course teacher: "+ course_teacher);
		System.out.println("Course credit: " + credit);
	}
	
	public void weeklyclass()
	{
		System.out.println("Weekly class done: " +total_class);
	}
	
	public void monthlyclass()
	{
		System.out.println("Monthly class done: "+ total_class*4);
	}
	
	public void yearlyclass()
	{
		System.out.println("Yearly class done: "+ total_class*52);
	}
}
