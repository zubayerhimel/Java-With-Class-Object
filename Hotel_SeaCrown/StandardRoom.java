package Hotel_SeaCrown;

public class StandardRoom extends Room{

	private String acAvailability;
	
	public StandardRoom()
	{
		
	}
	
	public void isACAvailable()
	{
		System.out.println("Is AC available for this room?");
		acAvailability = myscanner.next();
		
	}
}
