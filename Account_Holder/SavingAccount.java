package Account_Holder;

public class SavingAccount extends Account{
    private final double interestRate = .02;
    private int numberOfInterest = 0;

    public SavingAccount()
    {
        super();
    }
    public boolean getInterestAvailability()
    {
        numberOfInterest++;
        return numberOfInterest <  5;
    }
    public double getInterestRate(double money)
    {
        return money * interestRate;
    }
    public void displaySavingAccountInfo()
    {
        System.out.println("Account name   : "+getAccountName());
        System.out.println("Account number : "+getAccountNumber());
        System.out.println("Balance        : "+getBalance());
    }
}
