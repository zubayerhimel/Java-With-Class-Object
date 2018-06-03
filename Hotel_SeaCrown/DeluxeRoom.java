package Hotel_SeaCrown;

public class DeluxeRoom extends Room{

	private int room_size;
	
	public DeluxeRoom()
	{
		
	}
	
	public void inputRoomSize()
	{
		System.out.println("Please enter deluxe room size");
		room_size = myscanner.nextInt();
	}
}
