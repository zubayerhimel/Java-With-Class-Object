package Account_Holder;

public class CurrentAccount extends Account{
    private final double transactionFees = .01;
    private int transactionNumber = 0;

    public CurrentAccount()
    {
        super();
    }
    public boolean getTransactionFeesAvailability()
    {
        transactionNumber++;
        return transactionNumber > 10;
    }
    public double getTransactionFees(double money)
    {
        return money * transactionFees;
    }
    public void displayCurrentAccountInfo()
    {
        System.out.println("Account name   : "+getAccountName());
        System.out.println("Account number : "+getAccountNumber());
        System.out.println("Balance        : "+getBalance());
    }
}
