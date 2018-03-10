package StudentPortal;

public class StudentClass extends Liveresult{

	private String student_name;
	private String id;
	private String password;
	private String phone_number;
	private String mail_address;
	
	public void register(String sName, String id, String pass, String phn_number, String mA)
	{
		student_name = sName;
		this.id = id;
		password = pass;
		phone_number = phn_number;
		mail_address = mA;
	}
	
	public void login(String sid, String pass)
	{
		if(sid.equals(id) && pass.equals(password))
		{
			System.out.println("\n\nSuccessfully log in\n\n");
			display();
		}
		else 
		{
			System.out.println("Sorry!! you are not registerd or incorrect id and password");
		}
	}
	
	public void display()
	{
		System.out.println("Student name: "+ student_name);
		System.out.println("Student id: "+id);
		System.out.println("Phone number: "+phone_number);
		System.out.println("Mail address: "+mail_address);
	}
	
}
