package oopPractice.encapsulationAbstractionPolymorphism;

public class SavingsAccount extends BankAccount{

	private double interestRate;
	
	public SavingsAccount(int accountNumber, double initialBalance ,double interestRate){
		
		super(accountNumber, initialBalance);
		this.interestRate=interestRate;
	}

	public double getInterestRate( ){
		return interestRate;
	}
	public void setInterestRate(double interestRate){
		this.interestRate=interestRate;
	}
	
	@Override
	public void withdraw( double amount ){
		double fee = 2.0;
		if(amount>0 && balance >= amount + fee){
			balance-=(amount + fee);
		}
	}
}

/*

Problem : Banking System (Encapsulation, Abstraction & runtime polymorphism (overriding) -->dynamic 
Design a banking system with these classes:

BankAccount (abstract base class)

Properties: accountNumber (private), balance (protected)

Methods: deposit(amount), withdraw(amount) (abstract), getBalance()

SavingsAccount (inherits from BankAccount)

Adds: interestRate

Implements withdraw() with $2 fee per withdrawal

CheckingAccount (inherits from BankAccount)

Adds: overdraftLimit

Allows negative balances up to overdraftLimit

Requirements:

Use proper encapsulation (private properties with getters/setters)

Implement polymorphic withdraw() behavior

Prevent direct balance modification outside classes
 */
