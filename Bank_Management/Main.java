package Bank_Management;

public class Main {

	public static void main(String[] args) {
		
		
		AccountHolder acc = new AccountHolder();
		acc.inputAll();
		acc.DepositeMoney();
		acc.WithdrawMoney();
		acc.LoanMoney();
		acc.calculateInterest();
		
		double amount = acc.getCurrentBalance();
		
		AccountHolder acc2 = new AccountHolder();
		acc2.inputAll();
		double amount2 = acc2.getCurrentBalance();
		
		Manager manager = new Manager();
		manager.inputEmployeeInfo();
		manager.calculateSalaryOfManager(amount+amount2);
		
		Accountant accountant = new Accountant();
		accountant.inputEmployeeInfo();
		accountant.getEidBonus();
		accountant.getHonourableBonus();
		accountant.calculateSalaryOfAccountant(amount+amount2);
	}

}
