package Account_Holder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Which type of account do you want to create?");
        String type = myscanner.next();
        if(type.equalsIgnoreCase("saving"))
        {
            while(true) {
                SavingAccount sa = new SavingAccount();
                sa.inputAccountInfo();
                System.out.println("How much money do you want to deposit?");
                double saDepositMoney = myscanner.nextDouble();
                sa.depositMoney(saDepositMoney);
                System.out.println("After deposit the balance is " + sa.getBalance());
                System.out.println("How much money do you want to withdraw?");
                double saWithdrawMoney = myscanner.nextDouble();
                sa.withdrawMoney(type, saWithdrawMoney);
                System.out.println("After withdraw the balance is " + sa.getBalance());
                sa.displaySavingAccountInfo();
                if (sa.getInterestAvailability()) {
                    System.out.println("Deposit interest is 0 BDT");
                } else {
                    System.out.println("Deposit interest is " + sa.getInterestRate(saDepositMoney));
                }
                System.out.println("Want to deposit again? [yes/no]");
                String choice = myscanner.next();
                if(choice.contains("n"))
                    break;
            }
        }
        else
        {
            while(true) {
                CurrentAccount ca = new CurrentAccount();
                ca.inputAccountInfo();
                System.out.println("How much money do you want to deposit?");
                double caDepositMoney = myscanner.nextDouble();
                ca.depositMoney(caDepositMoney);
                if(ca.getTransactionFeesAvailability()){
                    System.out.println("Transaction fees is 0");
                }
                else
                {
                    System.out.println("Transaction fees is "+ca.getTransactionFees(caDepositMoney));
                }
                System.out.println("How much money do you want to withdraw?");
                double caWithdrawMoney = myscanner.nextDouble();
                ca.withdrawMoney(type,caWithdrawMoney);
                if(ca.getTransactionFeesAvailability())
                {
                    System.out.println("Transaction fees is 0");
                }
                else
                {
                    System.out.println("Transaction fees is "+ca.getTransactionFees(caWithdrawMoney));
                }
                ca.displayCurrentAccountInfo();
                System.out.println("Want to transaction again? [yes/no]");
                String choice = myscanner.next();
                if(choice.contains("n"))
                    break;
            }
        }
    }
}
