package StudentPortal;

public class FinalResult {

	private String subjectName;
	private double quizmarks;
	private double midmarks;
	private double finalmarks;
	private double assignmentmarks;
	private double labmarks;
	private double attendecemarks;
	private double totalNumber;
	
	public FinalResult(String subjectname, double qM, double mM, double fM, double assM, double lM , double attM)
	{
		subjectName = subjectname;
		quizmarks = qM;
		midmarks = mM;
		finalmarks = fM;
		assignmentmarks = assM;
		labmarks = lM;
		attendecemarks = attM;
	}
	
	public void SubjectGPa()
	{
		totalNumber = (quizmarks+midmarks+finalmarks+assignmentmarks+labmarks+attendecemarks);
		System.out.println("\n\nSubject name: "+subjectName);
		if(totalNumber>=80)
		{
			System.out.println("Number: "+totalNumber+"\tGrade: A+\tRemarks: Outstanding");
		}
		else if(totalNumber>=75)
		{
			System.out.println("Number: "+totalNumber+"\tGrade: A\tRemarks: Excellent");
		}
		else if(totalNumber>=70)
		{
			System.out.println("Number: "+totalNumber+"\tGrade: A-\tRemarks: Very good");
		}
		else if(totalNumber>= 65)
		{
			System.out.println("Number: "+totalNumber+"\tGrade: B+\tRemarks: Good");
		}
		else if(totalNumber>= 60)
		{
			System.out.println("Number: "+totalNumber+"\tGrade: B\tRemarks: Satisfactory");
		}
		else if(totalNumber>= 55)
		{
			System.out.println("Number: "+totalNumber+"\tGrade: B-\tRemarks: Above average");
		}
		else if(totalNumber>= 50)
		{
			System.out.println("Number: "+totalNumber+"\tGrade: C+\tRemarks: Average");
		}
		else if(totalNumber>= 45)
		{
			System.out.println("Number: "+totalNumber+"\tGrade: C\tRemarks: Below average");
		}
		else if(totalNumber>=40)
		{
			System.out.println("Number: "+totalNumber+"\tGrade: D\tRemarks: Pass");
		}
		else 
		{
			System.out.println("Number: "+totalNumber+"\tGrade: F\tRemarks: Fail");
		}
	}
}
