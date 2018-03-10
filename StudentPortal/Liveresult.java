package StudentPortal;

public class Liveresult{
	
	private double avg_marks;
	
	public double CalculateAvg(double...quizNumbers)
	{
		double total =0; 
		for(double i: quizNumbers)
		{
			total+=i;
		}
		
		avg_marks = (total/quizNumbers.length);
		
		return avg_marks;
	}

}
