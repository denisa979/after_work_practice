package oopPractice.encapsulationAbstractionPolymorphism;

public class CheckingAccount1 extends BankAccount1{
	
	private double overdraftLimit;
	
	public CheckingAccount1(int accountNumber, double initialBalance, double overdraftLimit){
		super(accountNumber, initialBalance);
		this.overdraftLimit=overdraftLimit;
	}

	public double getOverdraftLimit( ){
		return overdraftLimit;
	}

	public void setOverdraftLimit( double overdraftLimit ){
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw( double amount ){
		if(amount>0 && balance>= overdraftLimit){
			balance-=amount;
		}
	}
}
/*
CheckingAccount (inherits from BankAccount)

Adds: overdraftLimit

Allows negative balances up to overdraftLimit

Requirements:

Use proper encapsulation (private properties with getters/setters)

Implement polymorphic withdraw() behavior

Prevent direct balance modification outside classes
 */
