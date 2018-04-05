package Cricketer;

public class Controller {

	private String name;
	private int age;
	private String country;
	private int numberofrun;
	private int numberofwicket;
	private int numberofmatch;
	
	public Controller(String name, int age, String country)
	{
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public void increasingRun(int run)
	{
		numberofrun +=run;
	}
	
	public void increasingwicket(int wicket)
	{
		numberofwicket += wicket;
	}
	public void increasingmatch(int match)
	{
		numberofmatch += match;
	}
	
	public void printinfo()
	{
		System.out.println("Player name is: "+name);
		System.out.println("Player age is: "+age);
		System.out.println("player country is: "+country);
		System.out.println("Number of run he got: "+numberofrun);
		System.out.println("Number of wicket he got: "+numberofwicket);
		System.out.println("Number of match he played: "+numberofmatch);
	}
}
