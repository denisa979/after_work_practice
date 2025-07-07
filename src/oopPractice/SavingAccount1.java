package oopPractice;

public abstract class SavingAccount1 extends BankAccount1{
	private double interestRate;
	
	public SavingAccount1(int accountNumber, double initialBalance, double interestRate){
		super(accountNumber, initialBalance);
		this.interestRate=interestRate;
	}

	public double getInterestRate( ){
		return interestRate;
	}

	public void setInterestRate( double interestRate ){
		this.interestRate = interestRate;
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
