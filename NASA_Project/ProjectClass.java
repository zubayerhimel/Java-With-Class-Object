package NASA_Project;

public class ProjectClass {
	
	private double TotalBudget;
	
	public ProjectClass(double TotalBudget) {
	
		this.TotalBudget = TotalBudget;
	}
	
	public void TotalCost(int project_gemini, int viking_program)
	{
		int sum = project_gemini+viking_program;
		Budget(sum);
	}
	
	public void Budget(int sum)
	{
		if (sum>TotalBudget)
		{
			System.out.println("Projects can't be done. Insufficient budget");
		}
		else {
			System.out.println("Projects can be done");
		}
	}

}
