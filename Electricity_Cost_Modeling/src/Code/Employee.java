package Code;

public class Employee extends Person {

    private double totalCollectedBill;


    public Employee()
    {
        super();
        totalCollectedBill = 0;
    }

    // to update total collected bill through each consumer bill
    public void updateTotalCollectedBill(double bill)
    {
        totalCollectedBill += bill;
    }

    private double getTotalCollectedBill()
    {
        return totalCollectedBill;
    }

    public void displayEmployeeInfo()
    {
        System.out.println("Employee id          : "+getPersonId());
        System.out.println("Employee name        : "+getPersonName());
        System.out.println("Power plant name     : "+getPersonPowerplantName());
        System.out.println("Total collected bill : "+getTotalCollectedBill());
    }

}