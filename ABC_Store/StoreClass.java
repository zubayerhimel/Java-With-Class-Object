package ABC_Store;
public class StoreClass {
	
	public String name;
	public int id;
	public double salary;
	
	public StoreClass(String name, int id) {
	
		this.name = name;
		this.id = id;
	}
	
	public double monthlySalary(int daySalary)
	{
		salary = daySalary*30;
		return salary;
	}
	
	public double bonus(int sellingProducts)
	{
		if(sellingProducts>100) 
		{
			return 500;
		}
		else 
		{
			return 0;
		}
	}
	
	public void display()
	{
		System.out.println("Salesman name: "+name);
		System.out.println("Salesman id: "+id);
	}

}
