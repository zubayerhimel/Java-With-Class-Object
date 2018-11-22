package Code;

public class Consumer extends Person {

    private String consumerLocation;
    private double monthlyUsedPower;
    private double totalElectricityBill;
    private String consumerType;

    public Consumer()
    {
        super();
        totalElectricityBill = 0;
    }


    // method to input additional info of the consumer
    public void inputConsumerAdditionalInfo()
    {
        System.out.println("Enter consumer location      : ");
        consumerLocation = myscanner.next();
        System.out.println("Enter consumer type          : ");
        consumerType = myscanner.next();
        System.out.println("Monthly used power unit (KW) :");
        monthlyUsedPower = myscanner.nextDouble();
    }

    // method to get total electricity bill after doing all calculation
    private double getTotalElectricityBill(double price)
    {
        totalElectricityBill = monthlyUsedPower * price;

        totalElectricityBill += addServiceCharge(totalElectricityBill) + calculateTax(totalElectricityBill) - calculateDiscount(totalElectricityBill);

        return totalElectricityBill;

    }

    public double getTotalBill()
    {
        return totalElectricityBill;
    }

    // method to calculate service charge for consumer type
    private double addServiceCharge(double bill)
    {
        if(consumerType.equalsIgnoreCase("monthly"))
            return bill * .03;
        else
            return bill * .02;
    }


    // method to calcualte discount
    private double calculateDiscount(double bill)
    {
        if(monthlyUsedPower > 100)
            return bill * .02;
        else
            return 0.0;
    }

    // method to calculate tax
    private double calculateTax(double bill)
    {
        return bill * .04;
    }


    public void displayConsumerInfo(double PowerplantPrice)
    {
        System.out.println("Consumer id            : " +getPersonId());
        System.out.println("Consumer name          : "+getPersonName());
        System.out.println("Consumer location      : "+consumerLocation);
        System.out.println("Consumer type          : "+consumerType);
        System.out.println("Power plant name       :"+getPersonPowerplantName());
        System.out.println("Monthly used power     : "+monthlyUsedPower);
        System.out.println("Total electricity bill : "+getTotalElectricityBill(PowerplantPrice));
    }
}