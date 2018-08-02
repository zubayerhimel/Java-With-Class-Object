package Mentor_V2;

public class StudentClass extends PersonClass implements StudentInterface{

	private int absent_days;
	private double cgpa;
	private double payableMoney;
	private double paidMoney;
	
	public StudentClass()
	{
		super();
	}
	
	public void inputStudetAdditionalAttrubute()
	{
		System.out.print("Enter absent days       : ");
		absent_days = myscanner.nextInt();
		System.out.print("Enter cgpa              : ");
		cgpa = myscanner.nextDouble();
		System.out.print("Enter payable money     : ");
		payableMoney = myscanner.nextDouble();
		System.out.print("Enter paid money        : ");
		paidMoney = myscanner.nextDouble();
	}
	
	@Override
	public int getAbsentDays()
	{
		return absent_days;
	}
	
	@Override
	public double getCGPA()
	{
		return cgpa;
	}
	
	@Override
	public double showDue()
	{
		return payableMoney - paidMoney;
	}


	@Override
	public void inputStudentAdditionAttributes() {
		// TODO Auto-generated method stub
		
	}
}
