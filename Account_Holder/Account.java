package Account_Holder;

import java.util.Scanner;

public class Account {
    private String accountName;
    private String accountNumber;
    private double balance;

    Scanner myscanner;
    public Account()
    {
        myscanner = new Scanner(System.in);
    }
    public void inputAccountInfo()
    {
        System.out.println("Please enter account name");
        accountName = myscanner.next();
        System.out.println("Please enter account number");
        accountNumber = myscanner.next();
        System.out.println("Please enter first balance");
        balance = myscanner.nextDouble();
    }

    public double depositMoney(double money)
    {
        return balance += money;
    }

    public void withdrawMoney(String type, double money)
    {
        int flag = 0;
        if(type.equalsIgnoreCase("saving"))
        {
            if(balance > 500)
            {
                balance -= money;
                flag=1;
            }
        }
        else
        {
            if(balance > 2000)
            {
                balance -= money;
                flag=1;
            }
        }
        if(flag == 0)
        {
            System.out.println("Warning!!!!! Money is not sufficient to withdraw.");
        }
    }
    public String getAccountName()
    {
        return accountName;
    }
    public String getAccountNumber()
    {
        return accountNumber;
    }
    public double getBalance()
    {
        return balance;
    }
}
