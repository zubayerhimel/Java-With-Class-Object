package AIrCondition;

public class TempratureClass {
	
	private double temperature;
	

	public double ACTemperature(String weather)
	{
		if(weather.equalsIgnoreCase("cold"))
		{
			getTemaperature(25);
		}
		else 
		{
			getTemaperature(18);
		}
		return setTemperature();
	}
	
	public void getTemaperature(int temp)
	{
		this.temperature = temp;
	}
	
	public double setTemperature()
	{
		return temperature;
	}
}
