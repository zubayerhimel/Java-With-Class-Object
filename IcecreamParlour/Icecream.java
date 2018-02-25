package IcecreamParlour;

public class Icecream {
	
	String flavour;
	int amount;
	int flavourCost; 
	
	public void calculatebill(String flavour) {
		
		char lc = flavour.charAt(flavour.length()-1);
		int count =0;
		if(lc=='a'|| lc == 'e' || lc == 'i' || lc== 'o' || lc== 'u')
		{
			for(int i=0; i<flavour.length(); i++)
			{
				if(flavour.charAt(i)=='a'|| flavour.charAt(i) == 'e' || flavour.charAt(i) == 'i' || flavour.charAt(i) == 'o' || flavour.charAt(i) == 'u')
				{
					count++;
				}
			}
		}
	    flavourCost = count*10;
	}
	
	public void TotalCost(int amount)
	{
		System.out.println("Your bill is "+(amount*flavourCost));
	}
}
