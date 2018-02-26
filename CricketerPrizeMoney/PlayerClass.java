package CricketerPrizeMoney;

public class PlayerClass {

	public String name;
	public int age;
	public double total_prizeMoney;
	
    PlayerClass(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public double PrizeMoney(int match, int prizemoney)
	{
		total_prizeMoney = match*prizemoney;
		return total_prizeMoney;
	}
	
	public void bonusMoney(int match)
	{
		if(match>10)
		{
			total_prizeMoney+=1000;
		}
	}
	
	public void display()
	{
		System.out.println("Player name: "+name);
		System.out.println("Player age: "+age);
		System.out.println("Total prize money: "+total_prizeMoney);
	}
}
