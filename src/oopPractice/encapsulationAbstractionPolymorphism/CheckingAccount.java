package oopPractice.encapsulationAbstractionPolymorphism;

public class CheckingAccount extends BankAccount{
	private double overdraftLimit;
	
	public CheckingAccount(int accountNumber, double initialBalance, double overdraftLimit ){
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
		if(amount > 0 && amount >= overdraftLimit){
			balance -= amount;
		}
	}
}
/*
package oopPractice;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= -overdraftLimit) {
            balance -= amount;
        }
    }
}
 */
