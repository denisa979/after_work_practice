package oopPractice;

public class SavingsAccount2 extends BankAccount2{

	private double interestRate;
	
	public SavingsAccount2(int accountNumber, double initialBalance, double interestRate){
		super(accountNumber, initialBalance);
	}

	@Override
	public void withdraw( double amount ){
		double fee = 2.0;
		if(amount>0 && balance>=amount + fee){
			balance-=(amount+fee);
		}
	}
}
/*
SavingsAccount (inherits from BankAccount)

Adds: interestRate

Implements withdraw() with $2 fee per withdrawal

 */
