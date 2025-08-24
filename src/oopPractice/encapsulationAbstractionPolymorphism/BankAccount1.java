package oopPractice.encapsulationAbstractionPolymorphism;

public abstract class BankAccount1{
	
	private final int accountNumber;
	protected double balance;
	public BankAccount1( int accountNumber, double initialBalance){
		this.accountNumber=accountNumber;
		this.balance=initialBalance;
	}

	public double getBalance( ){
		return balance;
	}

	public int getAccountNumber( ){
		return accountNumber;
	}
	public void deposit(double amount){
		if(amount>0){
			balance+=amount;
		}
	}
	public abstract void withdraw(double amount);
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
