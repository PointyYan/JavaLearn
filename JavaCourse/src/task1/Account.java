package task1;

public class Account {

	protected double balance;
	
	Account(double balance ){
		this.balance=balance;
	}
	
	public Account(){
		super();
	}
	
	public double getBalance() {
		return this.balance;
	}
	public double deposit(double amount) {
		this.balance+=amount;
		return balance;
	}
	
	public double withdraw(double amount) {
		this.balance-=amount;
		return balance;
	}
	
}
