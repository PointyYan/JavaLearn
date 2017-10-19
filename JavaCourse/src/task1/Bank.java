package task1;

public class Bank {

	private Customer[] customers;
	private int numberOfCustomers;
	
	public Bank(){
		customers = new Customer[3];
		numberOfCustomers=0;
	}
	
	public void addC(String name) {
		customers[numberOfCustomers]= new Customer(name);
		numberOfCustomers++;
	}
	
	public int getNumOfC() {
		return numberOfCustomers;
	}
	
	public Customer getC(int num) {
		return customers[num];
	}
}
