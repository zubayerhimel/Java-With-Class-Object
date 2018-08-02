package HotelRoom_Bookings;

public interface RoomInterface {
    
    public void inputAll();
    public String getRoomNumber();
    public int getBedNumber();
    public double getRoomSize();
    public double getRoomRate();
    public void setCustomerId(String id);
    public String getCustomerId();
    
}
