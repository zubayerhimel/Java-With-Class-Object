package Footballer;

public class Player {
	
	private String name;
	private int age;
	private String country;
	private int numberofgoal;
	private int numberofmatch;
	private int numberofassist;
	
	public Player(String name, int age, String country)
	{
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public void increasinggoal(int goal)
	{
		numberofgoal+=goal;
	}
	public void increasingmatch(int match)
	{
		numberofmatch += match;
	}
	public void increasingassist(int assist)
	{
		numberofassist +=assist;
	}
	
	public void printinfo()
	{
		System.out.println("Name of the player is "+name);
		System.out.println("Age is "+age);
		System.out.println("Player country is "+country);
		System.out.println("Number of goal player did "+numberofgoal);
		System.out.println("Number of assists the player did "+numberofassist);
		System.out.println("Number of matches the player played "+ numberofmatch);
	}

}
